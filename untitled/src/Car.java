// Derived class inheriting from Vehicle
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand); // Call to superclass constructor
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println(getBrand() + " car is honking!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}