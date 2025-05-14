// Base class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    String studentId;
    String course;

    // Constructor
    Student(String name, int age, String studentId, String course) {
        // Call the superclass constructor
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    // Method specific to Student
    void displayStudentInfo() {
        // Call the inherited method
        displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// Main class
public class InheritanceStudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "ST123", "Computer Science");
        student1.displayStudentInfo();
    }
}

