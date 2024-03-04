package hotelManagement;

class Booking {
    private Room room;
    private Guest guest;

    public Booking(Room room, Guest guest) {
        this.room = room;
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public Guest getGuest() {
        return guest;
    }
}
