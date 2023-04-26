package org.example;

public class Main {
    public static void main(String[] args) {

        var recipe1 = new Recipe("makowiec");

        var ingredient1 = new Ingredient("mak");
        var ingredient2 = new Ingredient("cukier");
        var ingredient3 = new Ingredient("piasek");

        var user1 = new User("Dominik");

        var role1 = new Role("Admin");

        var userRole1 = new UserRole(user1, role1, "Poniedziałek","Za wpis o makowcu");

        var step1 = recipe1.createRecipeStep("Dokładnie wymieszaj mak i piasek");

        recipe1.addIngredient(ingredient1);
        recipe1.addIngredient(ingredient2);
        recipe1.addIngredient(ingredient2); //nie dopisze
        recipe1.addIngredient(ingredient3);

        recipe1.addUser(user1);




        System.out.println(step1.toString());
        System.out.println(recipe1);
        System.out.println(ingredient1);
        System.out.println("Hello world!");
    }
}