public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call to superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Beep beep!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Number of doors: " + numberOfDoors);
    }

    // Getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}