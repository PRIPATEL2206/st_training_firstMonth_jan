package travelPlanning;

import java.util.ArrayList;
import java.util.List;

class Itinerary {
    private List<Destination> destinations;

    public Itinerary() {
        this.destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void generateItinerary() {
        System.out.println("Travel Itinerary:");
        for (int i = 0; i < destinations.size(); i++) {
            System.out.println((i + 1) + ". " + destinations.get(i).getName());
        }
    }
}
