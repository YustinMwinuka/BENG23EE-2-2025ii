
        // Parent class
        class Animal {
            String makeSound() {
                return "Some sound";
            }
        }

// Subclass 1
        class Dog extends Animal {
            String makeSound() {
                return "Bark";
            }
        }

// Subclass 2
        class Cat extends Animal {
            String makeSound() {
                return "Meow";
            }
        }

// Subclass 3
        class Cow extends Animal {
            String makeSound() {
                return "Moo";
            }
        }

// Main class
        class TestAnimal {
            public static void main(String[] args) {
                Animal a;  // Reference of type Animal

                a = new Dog();
                System.out.println("Dog says: " + a.makeSound());

                a = new Cat();
                System.out.println("Cat says: " + a.makeSound());

                a = new Cow();
                System.out.println("Cow says: " + a.makeSound());
            }
        }
