import java.util.Scanner;
import java.util.InputMismatchException;

// Main.java
public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency("Super Rentals");

        // Adding cars
        Car car1 = new Car("KDA 123A", "Subaru");
        Car car2 = new Car("KDB 456B", "Lexus");
        agency.addCar(car1);
        agency.addCar(car2);

        // Adding customers
        Customer customer1 = new Customer("mike murimi", "M001");
        Customer customer2 = new Customer("ann njeri", "A002");
        agency.addCustomer(customer1);
        agency.addCustomer(customer2);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            try {
                System.out.println("\nWelcome to Super Rentals!");
                System.out.println("1. Rent a Car");
                System.out.println("2. Return a Car");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();  // Expecting an integer input
                
                if (choice == 1) {
                    agency.displayAvailableCars(); // Show available cars before renting
                    System.out.print("Enter your name: ");
                    String customerName = scanner.next();  // User enters their name
                    System.out.print("Enter your ID number: ");
                    String idNumber = scanner.next();  // User enters their ID number
                    System.out.print("Enter the name of the car to rent: ");
                    String carName = scanner.next();  // User enters car name
                    agency.rentCar(carName, customerName, idNumber);
                } else if (choice == 2) {
                    System.out.print("Enter your name: ");
                    String customerName = scanner.next();  // User enters their name
                    System.out.print("Enter the name of the car to return: ");
                    String carName = scanner.next();  // User enters car name
                    System.out.print("Enter your ID number: ");
                    String idNumber = scanner.next();  // User enters their ID number
                    agency.returnCar(carName, idNumber);
                } else if (choice == 3) {
                    System.out.println("Exiting the system...");
                } else {
                    System.out.println("Invalid choice. Please enter a valid option.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number for the menu choice.");
                scanner.next(); // Clear t1he invalid input
            }
        } while (choice != 3);
    }
}
