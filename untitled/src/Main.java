public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", 4);

        // Call inherited methods
        myCar.start();
        myCar.stop();

        // Call subclass-specific method
        myCar.honk();

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Doors: " + myCar.getNumberOfDoors());
    }
}