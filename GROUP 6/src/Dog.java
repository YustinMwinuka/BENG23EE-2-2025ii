// Child class inheriting from Animal
class Dog extends Animal {

    // Constructor
    Dog(String name) {
        super(name); // Call parent constructor
    }

    // Overriding speak() method
    @Override
    void speak() {
        System.out.println(name + " barks");
    }
}
