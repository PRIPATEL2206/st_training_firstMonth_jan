package auctionSystem;

import java.util.ArrayList;
import java.util.List;

class Item {
    private String name;
    private List<Bid> bids;
    private Bidder winningBidder;
    private double winningBidAmount;

    public Item(String name) {
        this.name = name;
        this.bids = new ArrayList<>();
        this.winningBidder = null;
        this.winningBidAmount = 0;
    }

    public String getName() {
        return name;
    }

    public void recordBid(Bidder bidder, double amount) {
        bids.add(new Bid(bidder, amount));
    }

    public List<Bid> getBids() {
        return bids;
    }

    public Bidder getWinningBidder() {
        return winningBidder;
    }

    public void setWinningBidder(Bidder winningBidder) {
        this.winningBidder = winningBidder;
    }

    public double getWinningBidAmount() {
        return winningBidAmount;
    }

    public void setWinningBidAmount(double winningBidAmount) {
        this.winningBidAmount = winningBidAmount;
    }
}
