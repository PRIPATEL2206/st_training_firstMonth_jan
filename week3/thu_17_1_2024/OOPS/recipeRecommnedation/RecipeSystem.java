package recipeRecommnedation;

import java.util.ArrayList;
import java.util.List;

public class RecipeSystem {
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("Chicken");
        Ingredient ingredient2 = new Ingredient("Broccoli");
        Ingredient ingredient3 = new Ingredient("Rice");
        Ingredient ingredient4 = new Ingredient("Tomato");

        Recipe recipe1 = new Recipe("Chicken Stir Fry");
        recipe1.addIngredient(ingredient1);
        recipe1.addIngredient(ingredient2);
        recipe1.addIngredient(ingredient3);

        Recipe recipe2 = new Recipe("Tomato Basil Pasta");
        recipe2.addIngredient(ingredient4);
        recipe2.addIngredient(ingredient3);

        User user = new User("Alice");
        user.addAvailableIngredient(ingredient1);
        user.addAvailableIngredient(ingredient3);
        user.addDietaryRestriction("vegetarian");

        List<Recipe> allRecipes = new ArrayList<>();
        allRecipes.add(recipe1);
        allRecipes.add(recipe2);

        List<Recipe> recommendedRecipes = user.recommendRecipes(allRecipes);

        System.out.println("Recommended Recipes for " + user.getName() + ":");
        for (Recipe recipe : recommendedRecipes) {
            System.out.println(recipe.getName());
        }
    }
}

