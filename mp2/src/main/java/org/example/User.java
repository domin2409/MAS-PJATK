package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class User {
    public String name; // public for simplicity
    private List<Recipe> recipes = new ArrayList<>();
    private List<UserRole> userRoles = new ArrayList<>();
    private Map<String, Recipe> reciepiesQualif = new TreeMap<>();

    public User(String name) {
        this.name = name;
    }

    public void addRecipeQualif(Recipe newRecipe) {     //Kwalifikowana
        // Check if we already have the info
        if(!reciepiesQualif.containsKey(newRecipe.name)) {
            reciepiesQualif.put(newRecipe.name, newRecipe);

            // Add the reverse connection
            newRecipe.addUser(this);
        }
    }

    public Recipe findRecipeQualif(String title) throws Exception {
        // Check if we have the info
        if(!reciepiesQualif.containsKey(title)) {
            throw new Exception("Unable to find a movie: " + title);
        }

        return reciepiesQualif.get(title);
    }


    public void addUserRole(UserRole newUserRole) {
        // Check if we already have the info
        if(!userRoles.contains(newUserRole)) {
            userRoles.add(newUserRole);

            // Add the reverse connection
            newUserRole.addUser(this);
        }
    }
/////////////////////////
//    public void addRecipe(Recipe newRecipe) {
//        // Check if we already have the info
//        if(!recipes.contains(newRecipe)) {
//            recipes.add(newRecipe);
//
//            // Add the reverse connection
//            newRecipe.addUser(this);
//        }
//    }
}
