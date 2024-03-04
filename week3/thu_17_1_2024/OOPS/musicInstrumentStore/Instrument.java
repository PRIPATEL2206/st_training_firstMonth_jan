package musicInstrumentStore;

class Instrument {
    private String serialNumber;
    private String brand;
    private String model;
    private double price;

    public Instrument(String serialNumber, String brand, String model, double price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " (Serial Number: " + serialNumber + ")";
    }
}
