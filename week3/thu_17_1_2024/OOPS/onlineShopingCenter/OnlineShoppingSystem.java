package onlineShopingCenter;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 999.99);
        Product smartphone = new Product("P002", "Smartphone", 499.99);
        Product headphones = new Product("P003", "Headphones", 79.99);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(laptop);
        shoppingCart.addItem(smartphone);
        shoppingCart.addItem(headphones);

        shoppingCart.displayCart();

        Order order = new Order("O001", shoppingCart, "Alice", "123 Main St, City");
        order.displayOrderDetails();
    }
}

