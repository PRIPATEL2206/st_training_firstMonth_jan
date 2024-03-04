package stockManagement;

import java.util.ArrayList;
import java.util.List;

class Portfolio {
    private List<Transaction> transactionHistory;

    public Portfolio() {
        this.transactionHistory = new ArrayList<>();
    }

    public void buyStock(Stock stock, int quantity, double price) {
        Transaction buyTransaction = new Transaction(stock, quantity, price, Transaction.TransactionType.BUY);
        transactionHistory.add(buyTransaction);
        System.out.println("Bought " + quantity + " shares of " + stock.getSymbol() +
                " at $" + price + " each. Total cost: $" + (quantity * price));
    }

    public void sellStock(Stock stock, int quantity, double price) {
        Transaction sellTransaction = new Transaction(stock, quantity, price, Transaction.TransactionType.SELL);
        transactionHistory.add(sellTransaction);
        System.out.println("Sold " + quantity + " shares of " + stock.getSymbol() +
                " at $" + price + " each. Total revenue: $" + (quantity * price));
    }

    public double calculatePortfolioValue() {
        double portfolioValue = 0;

        for (Transaction transaction : transactionHistory) {
            Stock stock = transaction.getStock();
            int quantity = transaction.getQuantity();
            double transactionPrice = transaction.getPrice();
            double stockValue = stock.getCurrentPrice() * quantity;

            if (transaction.getType() == Transaction.TransactionType.BUY) {
                portfolioValue -= stockValue;
            } else {
                portfolioValue += stockValue;
            }
        }

        return portfolioValue;
    }

    public void displayTransactionHistory() {
        System.out.println("\nTransaction History:");
        for (Transaction transaction : transactionHistory) {
            String action = (transaction.getType() == Transaction.TransactionType.BUY) ? "Bought" : "Sold";
            System.out.println(action + " " + transaction.getQuantity() + " shares of " +
                    transaction.getStock().getSymbol() + " at $" + transaction.getPrice() + " each.");
        }
    }
}
