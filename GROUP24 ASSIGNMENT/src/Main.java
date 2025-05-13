// File: Main.java

// Base class (Parent)
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.makeSound(); // Inherited from Animal
        myDog.bark();      // Defined in Dog
}
}
