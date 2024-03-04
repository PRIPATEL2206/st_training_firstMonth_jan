package parkingLot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ParkingLotSystem {
    public static void main(String[] args) {
        // Create a parking lot with an hourly rate of $2.50
        ParkingLot parkingLot = new ParkingLot(2.50);

        // Create vehicles
        Vehicle car = new Vehicle("ABC123", VehicleType.CAR);
        Vehicle motorcycle = new Vehicle("XYZ789", VehicleType.MOTORCYCLE);
        Vehicle truck = new Vehicle("DEF456", VehicleType.TRUCK);

        // Park vehicles
        Ticket carTicket = parkingLot.parkVehicle(car);
        Ticket motorcycleTicket = parkingLot.parkVehicle(motorcycle);
        Ticket truckTicket = parkingLot.parkVehicle(truck);

        // Retrieve vehicles
        parkingLot.retrieveVehicle(carTicket);
        parkingLot.retrieveVehicle(motorcycleTicket);
        parkingLot.retrieveVehicle(truckTicket);
    }
}

