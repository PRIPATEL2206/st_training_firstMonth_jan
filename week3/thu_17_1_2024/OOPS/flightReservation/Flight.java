package flightReservation;

import java.util.ArrayList;
import java.util.List;

class Flight {
    private String flightNumber;
    private String origin;
    private String destination;
    private int totalSeats;
    private List<Reservation> reservations;

    public Flight(String flightNumber, String origin, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.reservations = new ArrayList<>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public boolean isSeatAvailable() {
        return reservations.size() < totalSeats;
    }

    public Reservation bookSeat(Passenger passenger) {
        if (isSeatAvailable()) {
            Reservation reservation = new Reservation(passenger, this);
            reservations.add(reservation);
            System.out.println("Seat booked for " + passenger.getName() + " on flight " + flightNumber);
            return reservation;
        } else {
            System.out.println("Sorry, no seats available on flight " + flightNumber);
            return null;
        }
    }

    public void cancelReservation(Reservation reservation) {
        if (reservations.remove(reservation)) {
            System.out.println("Reservation canceled for " + reservation.getPassenger().getName() +
                    " on flight " + flightNumber);
        } else {
            System.out.println("Reservation not found for cancellation.");
        }
    }
}
