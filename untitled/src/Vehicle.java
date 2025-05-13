// Base class
public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }

    public void stop() {
        System.out.println(brand + " vehicle is stopping.");
    }

    public String getBrand() {
        return brand;
    }
}