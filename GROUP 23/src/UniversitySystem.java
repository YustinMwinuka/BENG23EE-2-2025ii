public class UniversitySystem {
    public static void main(String[] args) {
        // Create an array to store multiple Student objects
        Student[] students = new Student[3];

        // Initialize the student objects
        students[0] = new Student("Alice", 20, new int[]{85, 90, 78});
        students[1] = new Student("Bob", 22, new int[]{75, 80, 88});
        students[2] = new Student("Charlie", 21, new int[]{92, 87, 95});

        // Display information for each student
        for (Student student : students) {
            student.displayStudentInfo();
            System.out.println("----------------------");
        }
    }
}

// Base class: Person
class Person {
    protected String name;
    protected int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class: Student
class Student extends Person {
    private int[] testScores;

    // Constructor to initialize student details and scores
    public Student(String name, int age, int[] testScores) {
        super(name, age); // Call constructor of Person class
        if (testScores != null) {
            this.testScores = testScores.clone(); // Clone for safety
        } else {
            this.testScores = new int[0]; // Empty array to avoid null
        }
    }

    // Method to calculate the average of the test scores
    public double calculateAverage() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return testScores.length > 0 ? (double) sum / testScores.length : 0;
    }

    // Method to display student-specific information
    public void displayStudentInfo() {
        displayInfo(); // Call method from Person
        System.out.print("Test Scores: ");
        for (int score : testScores) {
            System.out.print(score + " ");
        }
        System.out.println(); // New line
        System.out.printf("Average Score: %.2f\n", calculateAverage());
    }
}

