package auctionSystem;

class Bid {
    private Bidder bidder;
    private double amount;

    public Bid(Bidder bidder, double amount) {
        this.bidder = bidder;
        this.amount = amount;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public double getAmount() {
        return amount;
    }
}
