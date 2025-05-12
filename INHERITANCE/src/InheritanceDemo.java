public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        // Set attributes from all levels
        myDog.name = "Buddy";
        myDog.numberOfLegs = 4;
        myDog.breed = "Golden Retriever";

        // Call methods from all levels
        myDog.eat();   // From Animal
        myDog.walk();  // From Mammal
        myDog.bark();  // From Dog
    }
}