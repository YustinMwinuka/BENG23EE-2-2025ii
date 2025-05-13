// Derived class
class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, int year, int numberOfDoors) {
        super(brand, year);  // Call the constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();  // Call the displayInfo method of Vehicle
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
