package movieTicketSystem;

import java.util.ArrayList;
import java.util.List;

class Cinema {
    private List<Movie> movies;
    private List<Ticket> availableTickets;

    public Cinema() {
        this.movies = new ArrayList<>();
        this.availableTickets = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Added movie: " + movie.getTitle());
    }

    public void displayMovies() {
        System.out.println("\nCurrently Showing Movies:");
        for (Movie movie : movies) {
            System.out.println("- " + movie.getTitle() + " (" + movie.getGenre() + ", " +
                    movie.getDurationMinutes() + " minutes)");
        }
    }

    public void generateTickets(Movie movie, int numberOfSeats, double ticketPrice) {
        for (int seatNumber = 1; seatNumber <= numberOfSeats; seatNumber++) {
            Ticket ticket = new Ticket(movie, seatNumber, ticketPrice);
            availableTickets.add(ticket);
        }
        System.out.println("\nGenerated " + numberOfSeats + " tickets for " + movie.getTitle() +
                ". Price per ticket: $" + ticketPrice);
    }

    public void displayAvailableTickets() {
        System.out.println("\nAvailable Tickets:");
        for (Ticket ticket : availableTickets) {
            System.out.println("Movie: " + ticket.getMovie().getTitle() +
                    ", Seat: " + ticket.getSeatNumber() + ", Price: $" + ticket.getPrice());
        }
    }

    public void bookTicket(Customer customer, Movie movie, int seatNumber) {
        for (Ticket ticket : availableTickets) {
            if (ticket.getMovie().equals(movie) && ticket.getSeatNumber() == seatNumber) {
                customer.bookTicket(ticket);
                availableTickets.remove(ticket);
                return;
            }
        }
        System.out.println("Ticket not available for Movie: " + movie.getTitle() + " at seat " + seatNumber);
    }
}
