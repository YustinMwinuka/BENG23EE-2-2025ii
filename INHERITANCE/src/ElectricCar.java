// Further derived class
class ElectricCar extends Car {
    int batteryCapacity; // in kWh

    ElectricCar(String brand, int year, int numberOfDoors, int batteryCapacity) {
        super(brand, year, numberOfDoors);  // Call the constructor of Car
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();  // Call the displayInfo method of Car
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}