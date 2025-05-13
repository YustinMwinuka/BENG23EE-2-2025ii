
    // Main class to run the demo
    public class StudentInfo {

        public static void main(String[] args) {
            System.out.println("--- Creating an Undergraduate Student ---");


            UndergraduateStudent alice = new UndergraduateStudent("UG101", "Alice", 2);

            System.out.println("\n--- Displaying Details using Overridden Method ---");
            alice.display();

            System.out.println("\n--- Accessing Inherited Attributes ---");
            System.out.println("Student Name: " + alice.name); // Accessing inherited 'name'

            System.out.println("\n--- Calling Subclass Specific Method ---");
            alice.printYearLevel();

    }
    }

