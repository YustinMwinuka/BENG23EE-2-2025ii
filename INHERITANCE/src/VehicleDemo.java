// Parent class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void move() {
        System.out.println("The vehicle is moving.");
    }

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class 1
class Car extends Vehicle {
    int doors;

    Car(String brand, int doors) {
        super(brand); // Call parent constructor
        this.doors = doors;
    }

    @Override
    void move() {
        System.out.println("The car drives on roads.");
    }

    void showDetails() {
        showBrand();
        System.out.println("Number of doors: " + doors);
    }
}

// Child class 2
class Bike extends Vehicle {
    boolean hasHelmet;

    Bike(String brand, boolean hasHelmet) {
        super(brand);
        this.hasHelmet = hasHelmet;
    }

    @Override
    void move() {
        System.out.println("The bike speeds on tracks.");
    }

    void showDetails() {
        showBrand();
        System.out.println("Helmet included: " + hasHelmet);
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Ferari", 4);
        Bike bike = new Bike("Yamaha", true);

        car.move();
        car.showDetails();

        bike.move();
        bike.showDetails();
    }
}
