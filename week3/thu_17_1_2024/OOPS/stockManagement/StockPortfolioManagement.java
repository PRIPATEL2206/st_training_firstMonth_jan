package stockManagement;


public class StockPortfolioManagement {
    public static void main(String[] args) {
        Stock appleStock = new Stock("AAPL", 150.0);
        Stock googleStock = new Stock("GOOGL", 2500.0);

        Portfolio portfolio = new Portfolio();

        portfolio.buyStock(appleStock, 10, 150.0);
        portfolio.sellStock(googleStock, 5, 2550.0);
        portfolio.buyStock(appleStock, 8, 160.0);

        portfolio.displayTransactionHistory();

        double portfolioValue = portfolio.calculatePortfolioValue();
        System.out.println("\nCurrent Portfolio Value: $" + portfolioValue);
    }
}