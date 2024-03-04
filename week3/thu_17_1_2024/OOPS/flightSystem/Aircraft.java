package flightSystem;

class Aircraft {
    private String registrationNumber;
    private String model;
    private boolean inFlight;

    public Aircraft(String registrationNumber, String model) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.inFlight = false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public boolean isInFlight() {
        return inFlight;
    }

    public void takeOff() {
        if (!inFlight) {
            inFlight = true;
            System.out.println("Aircraft " + registrationNumber + " has taken off.");
        } else {
            System.out.println("Aircraft " + registrationNumber + " is already in flight.");
        }
    }

    public void land() {
        if (inFlight) {
            inFlight = false;
            System.out.println("Aircraft " + registrationNumber + " has landed.");
        } else {
            System.out.println("Aircraft " + registrationNumber + " is already on the ground.");
        }
    }
}
