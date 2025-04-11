//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Student {
    String name;
    int gender;
    String regNo;


    void getInput(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        gender = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextLine();
    }

    void display() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("RegNo: " + regNo);
    }
}

class ProgramDetails {
    String programName;
    int duration;

    void getInput(Scanner sc) {
        System.out.print("Enter Program Name: ");
        programName = sc.nextLine();
        System.out.print("Enter Duration (in years): ");
        duration = sc.nextInt();
        sc.nextLine(); // consume newline
    }

    void display() {
        System.out.println("--- Program Details ---");
        System.out.println("Program Name: " + programName);
        System.out.println("Duration: " + duration + " years");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Enter Student Info");
            System.out.println("2. Enter Program Info");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.getInput(sc);
                    student.display();
                    break;

                case 2:
                    ProgramDetails program = new ProgramDetails();
                    program.getInput(sc);
                    program.display();
                    break;

                case 3:
                    keepRunning = false;
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
