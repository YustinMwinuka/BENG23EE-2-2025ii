// Parent class
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to be inherited and possibly overridden
    void speak() {
        System.out.println(name + " makes a sound");
    }
}

