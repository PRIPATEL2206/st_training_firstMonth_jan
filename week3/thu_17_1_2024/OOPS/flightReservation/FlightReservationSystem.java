package flightReservation;

import java.util.ArrayList;
import java.util.List;

public class FlightReservationSystem {
    public static void main(String[] args) {
        // Create a flight
        Flight flight1 = new Flight("F001", "New York", "Los Angeles", 50);

        // Create passengers
        Passenger passenger1 = new Passenger("Alice", "AB123456");
        Passenger passenger2 = new Passenger("Bob", "CD789012");

        // Book seats
        Reservation reservation1 = flight1.bookSeat(passenger1);
        Reservation reservation2 = flight1.bookSeat(passenger2);

        // Attempt to book another seat (should fail)
        Reservation reservation3 = flight1.bookSeat(new Passenger("Charlie", "EF345678"));

        // Cancel a reservation
        flight1.cancelReservation(reservation1);

        // Display flight information
        System.out.println("\nFlight Information:");
        System.out.println("Flight Number: " + flight1.getFlightNumber());
        System.out.println("Origin: " + flight1.getOrigin());
        System.out.println("Destination: " + flight1.getDestination());
        System.out.println("Total Seats: " + flight1.getTotalSeats());
        System.out.println("Available Seats: " + (flight1.getTotalSeats() - flight1.getReservations().size()));
    }
}

