// Child class
class Car extends Vehicle {
    Car() {
        System.out.println("Car constructor called.");
    }

    // Overriding the start method
    @Override
    void start() {
        System.out.println("Car is starting with keyless ignition...");
    }
}

