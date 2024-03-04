package stockManagement;

class Transaction {
    private Stock stock;
    private int quantity;
    private double price;
    private TransactionType type;

    public enum TransactionType {
        BUY, SELL
    }

    public Transaction(Stock stock, int quantity, double price, TransactionType type) {
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public Stock getStock() {
        return stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public TransactionType getType() {
        return type;
    }
}
