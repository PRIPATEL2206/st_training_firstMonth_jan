package recipeBook;

import java.util.ArrayList;
import java.util.List;

class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private String category;

    public Recipe(String name, String category) {
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
