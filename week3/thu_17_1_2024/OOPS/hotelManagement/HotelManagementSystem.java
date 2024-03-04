package hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(10);

        hotel.displayRoomAvailability();

        Guest guest1 = new Guest("Alice");
        Guest guest2 = new Guest("Bob");

        hotel.bookRoom(guest1);
        hotel.bookRoom(guest2);

        hotel.displayRoomAvailability();

        hotel.checkOut(guest1);

        hotel.displayRoomAvailability();
    }
}

