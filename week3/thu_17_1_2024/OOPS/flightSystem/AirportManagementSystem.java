package flightSystem;


public class AirportManagementSystem {
    public static void main(String[] args) {
        Airport airport1 = new Airport("Airport A");
        Airport airport2 = new Airport("Airport B");

        Aircraft aircraft1 = new Aircraft("ABC123", "Boeing 747");
        Aircraft aircraft2 = new Aircraft("XYZ789", "Airbus A320");

        airport1.parkAircraft(aircraft1);
        airport2.parkAircraft(aircraft2);

        System.out.println("\nParked Aircraft at " + airport1.getName() + ":");
        for (Aircraft aircraft : airport1.getParkedAircraft()) {
            System.out.println("- " + aircraft.getRegistrationNumber() + " (" + aircraft.getModel() + ")");
        }

        System.out.println("\nParked Aircraft at " + airport2.getName() + ":");
        for (Aircraft aircraft : airport2.getParkedAircraft()) {
            System.out.println("- " + aircraft.getRegistrationNumber() + " (" + aircraft.getModel() + ")");
        }

        airport1.releaseAircraft(aircraft1);
        airport2.releaseAircraft(aircraft2);
        Flight flight1 = new Flight("FL123", airport1, airport2);
        flight1.scheduleFlight();
    }
}

