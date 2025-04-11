import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Program program = new Program();

        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter Student Info");
            System.out.println("2. Enter Program Info");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student.input(scanner);
                    student.display();
                    break;
                case 2:
                    program.input(scanner);
                    program.display();
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1 or 2.");
            }

            System.out.print("Do you want to continue? (true/false): ");
            running = scanner.nextBoolean();
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
