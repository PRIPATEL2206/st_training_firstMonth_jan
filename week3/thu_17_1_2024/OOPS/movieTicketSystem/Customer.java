package movieTicketSystem;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Ticket> bookings;

    public Customer(String name) {
        this.name = name;
        this.bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Ticket> getBookings() {
        return bookings;
    }

    public void bookTicket(Ticket ticket) {
        bookings.add(ticket);
        System.out.println(name + " booked a ticket for " + ticket.getMovie().getTitle() +
                " at seat " + ticket.getSeatNumber() + ". Price: $" + ticket.getPrice());
    }

    public void viewBookings() {
        System.out.println("\n" + name + "'s Bookings:");
        for (Ticket ticket : bookings) {
            System.out.println("Movie: " + ticket.getMovie().getTitle() +
                    ", Seat: " + ticket.getSeatNumber() + ", Price: $" + ticket.getPrice());
        }
    }
}
