import java.util.Scanner;

class Student {
    String name;
    int age;
    String registrationNumber;

    public Student(String name, int age, String registrationNumber) {
        this.name = name;
        this.age = age;
        this.registrationNumber = registrationNumber;
    }

    public void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registration Number: " + registrationNumber);
    }
}

class Program {
    String programName;
    int duration;
    String department;

    public Program(String programName, int duration, String department) {
        this.programName = programName;
        this.duration = duration;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("\n--- Program Information ---");
        System.out.println("Program Name: " + programName);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Department: " + department);
    }
}

public class Major {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Enter Program Details");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    // Input for Student
                    System.out.println("Enter Student Details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Registration Number: ");
                    String regNumber = scanner.nextLine();

                    Student student = new Student(name, age, regNumber);
                    student.displayInfo();
                    break;

                case 2:
                    // Input for Program
                    System.out.println("Enter Program Details:");
                    System.out.print("Program Name: ");
                    String programName = scanner.nextLine();

                    System.out.print("Duration (in years): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Department: ");
                    String department = scanner.nextLine();

                    Program program = new Program(programName, duration, department);
                    program.displayInfo();
                    break;

                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0); // terminate the program

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}

