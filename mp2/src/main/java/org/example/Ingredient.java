package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ingredient {
    public String name; // public for simplicity
    private List<Recipe> recipes = new ArrayList<>();
    public Ingredient(String name) {
        this.name = name;
//        this.recipe = recipe;
    }

    public void addRecipe(Recipe newRecipe) {
        // Check if we already have the info
        if(!recipes.contains(newRecipe)) {
            recipes.add(newRecipe);

            // Add the reverse connection
            newRecipe.addIngredient(this);
        }
    }
    @Override
    public String toString() {
        var info = "Ingredient: " + name + "\n";

        // Add info about titles of his/her movies
        for(Recipe recipe : recipes) {
            info += "   " + recipe.name + "\n";
        }

        return info;
    }

//    public static Ingredient createOrderElement(Recipe recipe, String name) throws Exception {
//        if(recipe == null) {
//            throw new Exception("The given recipe does not exist!");
//        }
//
//        // Create a new part
//        Ingredient orderElement = new Ingredient(recipe, name);
//
//        // Add to the whole
//        Recipe.addPart(orderElement);
//
//        return Ingredient;
//    }
}
