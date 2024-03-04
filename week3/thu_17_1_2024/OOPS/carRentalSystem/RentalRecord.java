package carRentalSystem;

class RentalRecord {
    private Customer customer;
    private Car car;
    private boolean returned;

    public RentalRecord(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
        this.returned = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    public boolean isReturned() {
        return returned;
    }

    public void returnCar() {
        returned = true;
    }
}
