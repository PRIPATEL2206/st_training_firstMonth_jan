package flightSystem;

class Flight {
    private String flightNumber;
    private Airport departureAirport;
    private Airport arrivalAirport;

    public Flight(String flightNumber, Airport departureAirport, Airport arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void scheduleFlight() {
        System.out.println("Flight " + flightNumber + " scheduled from " +
                departureAirport.getName() + " to " + arrivalAirport.getName() + ".");
    }
}
