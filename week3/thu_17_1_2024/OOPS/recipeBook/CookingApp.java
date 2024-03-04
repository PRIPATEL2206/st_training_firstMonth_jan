package recipeBook;

import java.util.List;

public class CookingApp {
    public static void main(String[] args) {

        Ingredient tomato = new Ingredient("Tomato");
        Ingredient onion = new Ingredient("Onion");
        Ingredient pasta = new Ingredient("Pasta");
        Ingredient cheese = new Ingredient("Cheese");
        Ingredient chicken = new Ingredient("Chicken");

        Recipe pastaRecipe = new Recipe("Pasta with Tomato Sauce", "Italian");
        pastaRecipe.addIngredient(pasta);
        pastaRecipe.addIngredient(tomato);
        pastaRecipe.addIngredient(onion);
        pastaRecipe.addIngredient(cheese);

        Recipe chickenRecipe = new Recipe("Grilled Chicken Salad", "Healthy");
        chickenRecipe.addIngredient(chicken);
        chickenRecipe.addIngredient(tomato);
        chickenRecipe.addIngredient(onion);

        Recipe tomatoSoupRecipe = new Recipe("Tomato Soup", "Soup");
        tomatoSoupRecipe.addIngredient(tomato);
        tomatoSoupRecipe.addIngredient(onion);

        Cookbook cookbook = new Cookbook();

        cookbook.addRecipe(pastaRecipe);
        cookbook.addRecipe(chickenRecipe);
        cookbook.addRecipe(tomatoSoupRecipe);

        cookbook.displayRecipes();

        System.out.println("\nRecipes containing Tomato:");
        List<Recipe> tomatoRecipes = cookbook.searchByIngredient(tomato);
        for (Recipe recipe : tomatoRecipes) {
            System.out.println("- " + recipe.getName() + " (" + recipe.getCategory() + ")");
        }
    }
}

