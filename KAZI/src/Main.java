public class Main {

    // Superclass
    static class Animal {

        // Method Overloading - same name, different parameters
        public void speak() {
            System.out.println("The animal makes a sound.");
        }

        public void speak(String sound) {
            System.out.println("The animal says: " + sound);
        }

        public void speak(String sound, int times) {
            System.out.println("The animal says:");
            for (int i = 0; i < times; i++) {
                System.out.println(sound);
            }
        }

        // This method will be overridden
        public void move() {
            System.out.println("The animal moves in a general way.");
        }
    }

    // Subclass
    static class Dog extends Animal {

        // Method Overriding
        @Override
        public void move() {
            System.out.println("The dog runs on four legs.");
        }

        // Subclass-specific method
        public void fetch() {
            System.out.println("The dog fetches the ball.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();

        System.out.println("---- Method Overloading ----");
        genericAnimal.speak();
        genericAnimal.speak("Grrr!");
        genericAnimal.speak("Woof!", 3);

        System.out.println("\n---- Method Overriding ----");
        genericAnimal.move();  // From Animal
        dog.move();            // Overridden in Dog

        System.out.println("\n---- Subclass Method ----");
        dog.fetch();           // Only in Dog
    }
}