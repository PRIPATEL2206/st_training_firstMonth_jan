package movieTicketSystem;



public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Create a cinema
        Cinema cinema = new Cinema();

        // Add movies to the cinema
        Movie movie1 = new Movie("Inception", "Sci-Fi", 150);
        Movie movie2 = new Movie("The Shawshank Redemption", "Drama", 142);
        cinema.addMovie(movie1);
        cinema.addMovie(movie2);

        // Display available movies
        cinema.displayMovies();

        // Generate tickets for movies
        cinema.generateTickets(movie1, 20, 15.0);
        cinema.generateTickets(movie2, 15, 12.0);

        // Display available tickets
        cinema.displayAvailableTickets();

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Book tickets for customers
        cinema.bookTicket(customer1, movie1, 5);
        cinema.bookTicket(customer2, movie2, 8);

        // Display customer bookings
        customer1.viewBookings();
        customer2.viewBookings();

        // Display updated available tickets
        cinema.displayAvailableTickets();
    }
}

