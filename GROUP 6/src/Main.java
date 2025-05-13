// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        dog.speak();  // Output: Buddy barks
        cat.speak();  // Output: Whiskers meows
    }
}
