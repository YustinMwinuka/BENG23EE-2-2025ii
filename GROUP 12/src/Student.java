import java.util.Scanner;

public class Student {
    private String name;
    private String regno;
    private String gender;
    private int age;
    private String nationality;
    private int contact;

    public void input(Scanner scanner) {
        System.out.print("Enter student name: ");
        name = scanner.next();
        System.out.print("Enter Registration Number: ");
        regno = scanner.next();
        System.out.print("Enter Gender: ");
        gender = scanner.next();
        System.out.print("Enter student age: ");
        age = scanner.nextInt();
        System.out.print("Enter student Nationality: ");
        nationality = scanner.next();
        System.out.print("Enter Student Phone Number: ");
        contact = scanner.nextInt();
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + regno);
        System.out.println("Student gender: " + gender);
        System.out.println("Student Age: " + age);
        System.out.println("Student Nationality: " + nationality);
        System.out.println("Student Phone Number: " + contact);
    }
}
