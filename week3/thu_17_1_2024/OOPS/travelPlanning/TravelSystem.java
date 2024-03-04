package travelPlanning;



public class TravelSystem {
    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "City of Lights");
        Destination tokyo = new Destination("Tokyo", "Capital of Japan");
        Destination newYork = new Destination("New York", "The Big Apple");


        Traveler traveler = new Traveler("Alice");

        traveler.planTrip(paris);
        traveler.planTrip(tokyo);
        traveler.planTrip(newYork);

        traveler.viewItinerary();
    }
}

