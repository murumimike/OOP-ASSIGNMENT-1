// Car.java
public class Car {
    String registrationNumber;
    String model;
    boolean isRented;

    public Car(String registrationNumber, String model) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.isRented = false;
    }

    public void rentCar() {
        this.isRented = true;
    }

    public void returnCar() {
        this.isRented = false;
    }

    public void displayCar() {
        String status = isRented ? "Rented" : "Available";
        System.out.println(model + " (Reg: " + registrationNumber + ") - " + status);
    }
}
