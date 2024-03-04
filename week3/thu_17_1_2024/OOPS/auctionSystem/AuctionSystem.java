package auctionSystem;

import java.util.ArrayList;
import java.util.List;

public class AuctionSystem {
    public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction();

        // Create items
        Item painting = new Item("Beautiful Painting");
        Item sculpture = new Item("Bronze Sculpture");

        // Add items to the auction
        auction.addItem(painting);
        auction.addItem(sculpture);

        // Create bidders
        Bidder bidder1 = new Bidder("Bidder 1");
        Bidder bidder2 = new Bidder("Bidder 2");

        // Add bidders to the auction
        auction.addBidder(bidder1);
        auction.addBidder(bidder2);

        // Start the auction
        auction.startAuction();
    }
}
