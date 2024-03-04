package parkingLot;

import java.time.LocalDateTime;

class Ticket {
    private Vehicle vehicle;
    private LocalDateTime entryTime;

    public Ticket(Vehicle vehicle, LocalDateTime entryTime) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
}
