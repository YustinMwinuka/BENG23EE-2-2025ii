import java.util.Scanner;

public class Student {
    private String name;
    private String regno;
    private String gender;

    public void input(Scanner scanner) {
        System.out.print("Enter student name: ");
        name = scanner.next();
        System.out.print("Enter Registration Number: ");
        regno = scanner.next();
        System.out.print("Enter Gender: ");
        gender = scanner.next();
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + regno);
        System.out.println("Student gender: " + gender);
    }
}
