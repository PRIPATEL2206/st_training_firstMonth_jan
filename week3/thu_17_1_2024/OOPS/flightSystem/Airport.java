package flightSystem;

import java.util.ArrayList;
import java.util.List;

class Airport {
    private String name;
    private List<Aircraft> parkedAircraft;

    public Airport(String name) {
        this.name = name;
        this.parkedAircraft = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void parkAircraft(Aircraft aircraft) {
        if (!aircraft.isInFlight() && !parkedAircraft.contains(aircraft)) {
            parkedAircraft.add(aircraft);
            System.out.println("Aircraft " + aircraft.getRegistrationNumber() + " is parked at " + name + ".");
        } else {
            System.out.println("Parking failed. Aircraft is either in flight or already parked.");
        }
    }

    public void releaseAircraft(Aircraft aircraft) {
        if (parkedAircraft.contains(aircraft)) {
            parkedAircraft.remove(aircraft);
            System.out.println("Aircraft " + aircraft.getRegistrationNumber() + " has left " + name + ".");
        } else {
            System.out.println("Release failed. Aircraft is not parked at this airport.");
        }
    }

    public List<Aircraft> getParkedAircraft() {
        return parkedAircraft;
    }
}
