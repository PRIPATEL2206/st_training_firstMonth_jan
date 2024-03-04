package carRentalSystem;

class Car {
    private String model;
    private boolean available;

    public Car(String model) {
        this.model = model;
        this.available = true;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        available = false;
    }

    public void returnCar() {
        available = true;
    }
}
