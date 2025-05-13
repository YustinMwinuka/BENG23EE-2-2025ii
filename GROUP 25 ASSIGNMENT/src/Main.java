// File: Main.java

// Parent class
class Car {
    String brand = "Toyota";

    void honk() {
        System.out.println("Beep beep!");
    }
}

// Child class
class SportsCar extends Car {
    int topSpeed = 300;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Top Speed: " + topSpeed + " km/h");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();

        myCar.honk();           // Inherited method
        myCar.displayDetails(); // Method from child class
}
}