// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Subclass: Lion
class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " roars.");
    }
}

// Subclass: Elephant
class Elephant extends Animal {
    Elephant(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " trumpets.");
    }
}

// Zoo class with main method
public class zoo {
    public static void main(String[] args) {
        Animal simba = new Lion("Simba");
        Animal dumbo = new Elephant("Dumbo");

        Animal[] animals = {simba, dumbo};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}