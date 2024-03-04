package recipeRecommnedation;

import java.util.ArrayList;
import java.util.List;

class Recipe {
    private String name;
    private List<Ingredient> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public boolean hasIngredients(List<Ingredient> availableIngredients) {
        for (Ingredient ingredient : ingredients) {
            if (!availableIngredients.contains(ingredient)) {
                return false;
            }
        }
        return true;
    }
}
