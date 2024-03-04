package parkingLot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class ParkingLot {
    private Map<Vehicle, Ticket> parkedVehicles;
    private double hourlyRate;

    public ParkingLot(double hourlyRate) {
        this.parkedVehicles = new HashMap<>();
        this.hourlyRate = hourlyRate;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        if (parkedVehicles.containsKey(vehicle)) {
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " is already parked.");
            return null;
        }

        Ticket ticket = new Ticket(vehicle, LocalDateTime.now());
        parkedVehicles.put(vehicle, ticket);
        System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " parked. Entry time: " +
                ticket.getEntryTime());
        return ticket;
    }

    public void retrieveVehicle(Ticket ticket) {
        Vehicle vehicle = ticket.getVehicle();
        if (!parkedVehicles.containsKey(vehicle)) {
            System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() + " is not parked.");
            return;
        }

        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
        double parkingFee = calculateParkingFee(duration.toHours());

        System.out.println("Vehicle with license plate " + vehicle.getLicensePlate() +
                " retrieved. Entry time: " + ticket.getEntryTime() +
                ", Exit time: " + exitTime + ", Parking fee: $" + parkingFee);

        parkedVehicles.remove(vehicle);
    }

    private double calculateParkingFee(long hoursParked) {
        return hoursParked * hourlyRate;
    }
}
