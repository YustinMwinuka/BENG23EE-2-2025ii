import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        STUDENT student = null;
        PROGRAM program = null;

        System.out.println("Welcome to Student and Program Management System");

        // Main program loop - runs until user chooses to exit
        while (running) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Create Student");
            System.out.println("2. Create Program");
            System.out.println("3. Display Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Switch statement to handle different options
            switch (choice) {
                case 1:
                    // Create Student object
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter student age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter student reg no: ");
                    String studentId = scanner.nextLine();

                    student = new STUDENT(studentName, studentAge, studentId);
                    System.out.println("Student created successfully!");
                    break;

                case 2:
                    // Create Program object
                    System.out.print("Enter program name: ");
                    String programName = scanner.nextLine();

                    System.out.print("Enter program duration (in years): ");
                    int programDuration = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();

                    program = new PROGRAM(programName, programDuration, department);
                    System.out.println("Program created successfully!");
                    break;

                case 3:
                    // Display information
                    if (student == null && program == null) {
                        System.out.println("No information to display. Please create a student and program first.");
                    } else {
                        System.out.println("\n--- Displaying All Information ---");
                        if (student != null) {
                            student.displayInfo();
                        } else {
                            System.out.println("No student information available.");
                        }

                        if (program != null) {
                            program.displayInfo();
                        } else {
                            System.out.println("No program information available.");
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank you for using Student and Program Management System. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

