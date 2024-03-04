package auctionSystem;

import java.util.ArrayList;
import java.util.List;

class Auction {
    private List<Item> items;
    private List<Bidder> bidders;

    public Auction() {
        this.items = new ArrayList<>();
        this.bidders = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    public void startAuction() {
        for (Item item : items) {
            System.out.println("Auction for Item: " + item.getName());

            for (Bidder bidder : bidders) {
                double bidAmount = bidder.placeBid(item);
                item.recordBid(bidder, bidAmount);
            }

            Item winningItem = determineWinningBid(item);
            if (winningItem != null) {
                System.out.println("Winning bid for " + item.getName() + ": " +
                        winningItem.getWinningBidder().getName() + " with a bid of $" +
                        winningItem.getWinningBidAmount());
            } else {
                System.out.println("No winning bid for " + item.getName());
            }

            System.out.println(); // Separator between items
        }
    }

    private Item determineWinningBid(Item item) {
        double maxBid = 0;
        Bidder winningBidder = null;

        for (Bid bid : item.getBids()) {
            if (bid.getAmount() > maxBid) {
                maxBid = bid.getAmount();
                winningBidder = bid.getBidder();
            }
        }

        if (winningBidder != null) {
            item.setWinningBidder(winningBidder);
            item.setWinningBidAmount(maxBid);
        }

        return item;
    }
}
