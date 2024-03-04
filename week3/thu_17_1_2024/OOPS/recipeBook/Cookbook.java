package recipeBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Cookbook {
    private Map<String, List<Recipe>> recipesByCategory;

    public Cookbook() {
        this.recipesByCategory = new HashMap<>();
    }

    public void addRecipe(Recipe recipe) {
        String category = recipe.getCategory();
        recipesByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(recipe);
    }

    public List<Recipe> searchByIngredient(Ingredient ingredient) {
        List<Recipe> matchingRecipes = new ArrayList<>();
        for (List<Recipe> recipes : recipesByCategory.values()) {
            for (Recipe recipe : recipes) {
                if (recipe.getIngredients().contains(ingredient)) {
                    matchingRecipes.add(recipe);
                }
            }
        }
        return matchingRecipes;
    }

    public void displayRecipes() {
        System.out.println("\nCookbook:");
        for (Map.Entry<String, List<Recipe>> entry : recipesByCategory.entrySet()) {
            String category = entry.getKey();
            List<Recipe> recipes = entry.getValue();

            System.out.println("\nCategory: " + category);
            for (Recipe recipe : recipes) {
                System.out.println("- " + recipe.getName());
            }
        }
    }
}
