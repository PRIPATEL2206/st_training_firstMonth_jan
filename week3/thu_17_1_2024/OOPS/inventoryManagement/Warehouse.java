package inventoryManagement;

import java.util.HashMap;
import java.util.Map;

class Warehouse {
    private Map<String, Category> categories;

    public Warehouse() {
        this.categories = new HashMap<>();
    }

    public void addCategory(Category category) {
        categories.put(category.getCategoryName(), category);
    }

    public void removeCategory(String categoryName) {
        categories.remove(categoryName);
    }

    public void addProductToCategory(String categoryName, Product product) {
        if (categories.containsKey(categoryName)) {
            categories.get(categoryName).addProduct(product);
        } else {
            System.out.println("Category not found: " + categoryName);
        }
    }

    public void removeProductFromCategory(String categoryName, Product product) {
        if (categories.containsKey(categoryName)) {
            categories.get(categoryName).removeProduct(product);
        } else {
            System.out.println("Category not found: " + categoryName);
        }
    }

    public void updateStock(String productId, int quantity) {
        for (Category category : categories.values()) {
            for (Product product : category.getProducts()) {
                if (product.getProductId().equals(productId)) {
                    int newQuantity = product.getStockQuantity() + quantity;
                    product.setStockQuantity(newQuantity);
                    return;
                }
            }
        }
        System.out.println("Product not found: " + productId);
    }

    public void generateInventoryReport() {
        System.out.println("Inventory Report:");
        for (Category category : categories.values()) {
            System.out.println("Category: " + category.getCategoryName());
            for (Product product : category.getProducts()) {
                System.out.println("  Product: " + product.getName() +
                        ", Stock Quantity: " + product.getStockQuantity());
            }
            System.out.println();
        }
    }
}
