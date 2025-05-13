public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("Generic", 2020);
        vehicle.start();
        vehicle.displayInfo();

        System.out.println(); // Blank line for separation

        // Create a Car object
        Car car = new Car("Toyota", 2022, 4);
        car.start(); // Inherited method
        car.honk();  // Subclass-specific method
        car.displayInfo(); // Overridden method

        // Accessing inherited fields via getters
        System.out.println("\nCar brand: " + car.getBrand());
        System.out.println("Car year: " + car.getYear());
        System.out.println("Car doors: " + car.getNumberOfDoors());
    }
}