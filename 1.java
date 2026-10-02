/* @SamyakPusate 
 * This program demonstrates Object-Oriented Programming (OOP) core pillars in Java.
 * It defines a blueprint class 'Car' containing fields, a parameterized constructor 
 * to initialize states, and methods to process data, which are then instantiated 
 * as independent objects ('car1', 'car2') inside the main driver class.
 */

class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + year + " " + brand + " " + model);
    }

    public int calculateCarAge(int currentYear) {
        return currentYear - this.year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2018);
        Car car2 = new Car("Tesla", "Model 3", 2023);

        System.out.println("--- Information for Car 1 ---");
        car1.displayDetails(); 
        int ageOfCar1 = car1.calculateCarAge(2026);
        System.out.println("Age of Car 1: " + ageOfCar1 + " years old.");

        System.out.println("\n--- Information for Car 2 ---");
        car2.displayDetails();
        int ageOfCar2 = car2.calculateCarAge(2026);
        System.out.println("Age of Car 2: " + ageOfCar2 + " years old.");
    }
}
