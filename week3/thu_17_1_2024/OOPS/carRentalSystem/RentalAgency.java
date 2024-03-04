package carRentalSystem;

import java.util.ArrayList;
import java.util.List;

class RentalAgency {
    private List<Car> cars;
    private List<RentalRecord> rentalHistory;

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.rentalHistory = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void rentCar(Customer customer, Car car) {
        if (car.isAvailable()) {
            car.rent();
            RentalRecord rentalRecord = new RentalRecord(customer, car);
            rentalHistory.add(rentalRecord);
            System.out.println(customer.getName() + " rented a " + car.getModel());
        } else {
            System.out.println("Car not available for rent.");
        }
    }

    public void returnCar(Customer customer, Car car) {
        if (!car.isAvailable()) {
            car.returnCar();
            for (RentalRecord record : rentalHistory) {
                if (record.getCar().equals(car) && record.getCustomer().equals(customer) && !record.isReturned()) {
                    record.returnCar();
                    System.out.println(customer.getName() + " returned a " + car.getModel());
                    break;
                }
            }
        } else {
            System.out.println("Car is already available. Please check.");
        }
    }

    public List<RentalRecord> getRentalHistory() {
        return rentalHistory;
    }
}
