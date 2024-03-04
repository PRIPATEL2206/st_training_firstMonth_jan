package hotelManagement;

import java.util.ArrayList;
import java.util.List;

class Hotel {
    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel(int numRooms) {
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();

        // Initialize rooms
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void displayRoomAvailability() {
        System.out.println("\nRoom Availability:");
        for (Room room : rooms) {
            System.out.println("Room " + room.getRoomNumber() + ": " +
                    (room.isAvailable() ? "Available" : "Booked"));
        }
    }

    public void bookRoom(Guest guest) {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                Booking booking = new Booking(room, guest);
                bookings.add(booking);
                room.bookRoom();
                System.out.println(guest.getName() + " booked Room " + room.getRoomNumber());
                return;
            }
        }
        System.out.println("No available rooms to book.");
    }

    public void checkOut(Guest guest) {
        for (Booking booking : bookings) {
            if (booking.getGuest() == guest) {
                booking.getRoom().checkOut();
                bookings.remove(booking);
                System.out.println(guest.getName() + " checked out.");
                return;
            }
        }
        System.out.println(guest.getName() + " does not have an active booking.");
    }
}
