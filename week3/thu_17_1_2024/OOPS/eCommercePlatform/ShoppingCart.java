package eCommercePlatform;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println("Added " + product.getName() + " to the shopping cart.");
    }

    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Product item : items) {
            System.out.println("- " + item.getName() + " ($" + item.getPrice() + ")");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
