import java.util.ArrayList;

// RentalAgency.java
public class RentalAgency {
    String agencyName;
    ArrayList<Car> cars;
    ArrayList<Customer> customers;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAvailableCars() {
        System.out.println("\nAvailable Cars in " + agencyName + ":");
        for (Car car : cars) {
            if (!car.isRented) { // Only show available cars
                car.displayCar();
            }
        }
    }

    public void rentCar(String model, String customerName, String idNumber) {
        for (Car car : cars) {
            if (car.model.equalsIgnoreCase(model) && !car.isRented) {
                car.rentCar();
                System.out.println("Car rented to " + customerName + " (ID Number: " + idNumber + ")");
                return;
            }
        }
        System.out.println("Car " + model + " is not available for rent.");
    }

    public void returnCar(String model, String idNumber) {
        for (Car car : cars) {
            if (car.model.equalsIgnoreCase(model) && car.isRented) {
                car.returnCar();
                System.out.println("Car " + model + " has been returned by ID Number: " + idNumber);
                return;
            }
        }
        System.out.println("Car " + model + " is not found or is not currently rented.");
    }
}
