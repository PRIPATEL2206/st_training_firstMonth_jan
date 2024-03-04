package recipeRecommnedation;

import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private List<Ingredient> availableIngredients;
    private List<String> dietaryRestrictions;

    public User(String name) {
        this.name = name;
        this.availableIngredients = new ArrayList<>();
        this.dietaryRestrictions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getAvailableIngredients() {
        return availableIngredients;
    }

    public void addAvailableIngredient(Ingredient ingredient) {
        availableIngredients.add(ingredient);
    }

    public List<String> getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public void addDietaryRestriction(String restriction) {
        dietaryRestrictions.add(restriction);
    }

    public List<Recipe> recommendRecipes(List<Recipe> allRecipes) {
        List<Recipe> recommendedRecipes = new ArrayList<>();

        for (Recipe recipe : allRecipes) {
            if (recipe.hasIngredients(availableIngredients) && !hasDietaryRestrictions(recipe)) {
                recommendedRecipes.add(recipe);
            }
        }

        return recommendedRecipes;
    }

    private boolean hasDietaryRestrictions(Recipe recipe) {
        for (String restriction : dietaryRestrictions) {
            if (recipe.getName().toLowerCase().contains(restriction.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
