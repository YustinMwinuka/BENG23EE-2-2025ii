// Main class to run the program
public class InheritanceVehicleDemo {
    public static void main(String[] args) {
        ElectricCar myTesla = new ElectricCar();

        // Set attributes from all levels
        myTesla.brand = "Tesla Model S";
        myTesla.numberOfDoors = 4;
        myTesla.batteryCapacity = 100;

        // Call methods from all levels
        myTesla.start();    // From Vehicle
        myTesla.drive();    // From Car
        myTesla.charge();   // From ElectricCar
    }
}
