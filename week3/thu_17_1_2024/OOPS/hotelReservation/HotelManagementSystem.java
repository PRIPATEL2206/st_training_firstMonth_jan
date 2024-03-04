package hotelReservation;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {
    public static void main(String[] args) {
        // Create a hotel with 10 rooms
        Hotel hotel = new Hotel(10);

        // Display initial room availability
        hotel.displayRoomAvailability();

        // Create guests
        Guest guest1 = new Guest("Alice", "123-456-7890");
        Guest guest2 = new Guest("Bob", "987-654-3210");

        // Book rooms for guests
        hotel.bookRoom(guest1, "2024-01-20", "2024-01-25");
        hotel.bookRoom(guest2, "2024-02-01", "2024-02-05");

        // Display updated room availability
        hotel.displayRoomAvailability();

        // Check out guests
        hotel.checkOut(guest1);

        // Display final room availability
        hotel.displayRoomAvailability();
    }
}

