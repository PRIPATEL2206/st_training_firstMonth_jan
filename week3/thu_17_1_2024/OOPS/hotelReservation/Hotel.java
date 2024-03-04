package hotelReservation;

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;

    public Hotel(int numRooms) {
        this.rooms = new ArrayList<>();
        this.reservations = new ArrayList<>();

        // Initialize rooms
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void displayRoomAvailability() {
        System.out.println("\nRoom Availability:");
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " +
                    (room.isAvailable() ? "Available" : "Booked"));
        }
    }

    public void bookRoom(Guest guest, String checkInDate, String checkOutDate) {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                Reservation reservation = new Reservation(room, guest, checkInDate, checkOutDate);
                reservations.add(reservation);
                room.bookRoom();
                System.out.println(guest.getName() + " booked Room " + room.getRoomNumber() +
                        " from " + checkInDate + " to " + checkOutDate);
                return;
            }
        }
        System.out.println("No available rooms to book.");
    }

    public void checkOut(Guest guest) {
        for (Reservation reservation : reservations) {
            if (reservation.getGuest() == guest) {
                reservation.getRoom().checkOut();
                reservations.remove(reservation);
                System.out.println(guest.getName() + " checked out.");
                return;
            }
        }
        System.out.println(guest.getName() + " does not have an active reservation.");
    }
}
