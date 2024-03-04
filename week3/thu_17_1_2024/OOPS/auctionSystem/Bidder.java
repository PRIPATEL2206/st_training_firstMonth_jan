package auctionSystem;

class Bidder {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double placeBid(Item item) {
        // Simplified logic: Generate a random bid amount for the example
        double bidAmount = Math.random() * 1000;
        System.out.println(name + " placed a bid of $" + bidAmount + " on " + item.getName());
        return bidAmount;
    }
}
