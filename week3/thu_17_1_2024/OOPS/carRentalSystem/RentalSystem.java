package carRentalSystem;

import java.util.List;

public class RentalSystem {
    public static void main(String[] args) {
        // Create a rental agency
        RentalAgency rentalAgency = new RentalAgency();

        // Add cars to the agency
        Car car1 = new Car("Toyota Camry");
        Car car2 = new Car("Honda Civic");

        rentalAgency.addCar(car1);
        rentalAgency.addCar(car2);

        // Create customers
        Customer customer1 = new Customer("Alice", "alice@example.com");
        Customer customer2 = new Customer("Bob", "bob@example.com");

        // Rent and return cars
        rentalAgency.rentCar(customer1, car1);
        rentalAgency.rentCar(customer2, car2);

        rentalAgency.returnCar(customer1, car1);
        rentalAgency.returnCar(customer2, car2);

        // Display rental history
        List<RentalRecord> rentalHistory = rentalAgency.getRentalHistory();
        System.out.println("\nRental History:");
        for (RentalRecord record : rentalHistory) {
            System.out.println(record.getCustomer().getName() + " rented a " +
                    record.getCar().getModel() + " (Returned: " + record.isReturned() + ")");
        }
    }
}

