package eCommercePlatform;

class Order {
    private String orderId;
    private ShoppingCart cart;
    private String customerName;
    private String shippingAddress;

    public Order(String orderId, ShoppingCart cart, String customerName, String shippingAddress) {
        this.orderId = orderId;
        this.cart = cart;
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
    }

    public String getOrderId() {
        return orderId;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public double calculateTotal() {
        return cart.calculateTotal();
    }

    public void displayOrderDetails() {
        System.out.println("\nOrder Details (Order ID: " + orderId + "):");
        System.out.println("Customer: " + customerName);
        System.out.println("Shipping Address: " + shippingAddress);
        cart.displayCart();
        System.out.println("Total: $" + calculateTotal());
    }
}
