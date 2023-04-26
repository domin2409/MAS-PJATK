package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recipe {
    public String name;

    private List<Ingredient> ingredients = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private List<RecipeStep> recipeSteps = new ArrayList<>();       //kompozycja


//    private static Set<Ingredient> allElements = new HashSet<>();

    public Recipe(String name) {
        this.name = name;
    }

    public RecipeStep createRecipeStep(String recipeStepName) {
        RecipeStep recipeStep = new RecipeStep(recipeStepName);
        recipeSteps.add(recipeStep);

        return recipeStep;
    }


    //zwrotne
    public void addIngredient(Ingredient newIngredient) {
        // Check if we already have the info
        if(!ingredients.contains(newIngredient)) {
            ingredients.add(newIngredient);

            // Add the reverse connection
            newIngredient.addRecipe(this);
        }
    }
    public void addUser(User newUser) {
        // Check if we already have the info
        if(!users.contains(newUser)) {
            users.add(newUser);

            // Add the reverse connection
            newUser.addRecipeQualif(this);
        }
    }


    //// /zwrotne

    @Override
    public String toString() {
        var info = "Recipe: " + name + "\n";

        // Add info about titles of his/her movies
        for(Ingredient ingredient : ingredients) {
            info += "   " + ingredient.name + "\n";
        }

        return info;
    }


    public class RecipeStep {   //kompozycja
        private String name;
//        nie musimy tworzyć ręcznego powiązania
        //    private Recipe recipe;
        public RecipeStep(String name) {
            this.name = name;
        }
    }

}

