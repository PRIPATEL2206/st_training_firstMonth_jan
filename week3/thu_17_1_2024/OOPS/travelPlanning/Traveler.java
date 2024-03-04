package travelPlanning;

class Traveler {
    private String name;
    private Itinerary itinerary;

    public Traveler(String name) {
        this.name = name;
        this.itinerary = new Itinerary();
    }

    public void planTrip(Destination destination) {
        itinerary.addDestination(destination);
    }

    public void viewItinerary() {
        System.out.println("Itinerary for " + name + ":");
        itinerary.generateItinerary();
    }
}
