public class animal {
    public static void main(String[] args) {
        class Animal {
            void eat() {
                System.out.println("This animal eats food.");
            }

            void sleep() {
                System.out.println("This animal sleeps.");
            }
        }

// Derived class (Child)
        class Dog extends Animal {
            void bark() {
                System.out.println("The dog barks.");
            }
        }
                Dog myDog = new Dog();

            // Calling methods from the parent class
            myDog.eat();
            myDog.sleep();
            myDog.bark();
        }
    }
