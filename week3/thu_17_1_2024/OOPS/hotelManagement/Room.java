package hotelManagement;

class Room {
    private int roomNumber;
    private boolean isAvailable;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " booked.");
        } else {
            System.out.println("Room " + roomNumber + " is not available for booking.");
        }
    }

    public void checkOut() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Guest checked out of Room " + roomNumber + ".");
        } else {
            System.out.println("Room " + roomNumber + " is already available.");
        }
    }
}
