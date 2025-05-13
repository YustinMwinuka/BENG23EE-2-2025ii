// Derived class 2
class ElectricCar extends Car {
    int batteryCapacity; // in kWh

    void charge() {
        System.out.println(brand + " is charging with a " + batteryCapacity + "kWh battery.");
    }
}