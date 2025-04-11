import java.util.Scanner;

public class Program {
    private String programName;
    private String department;
    private int duration;

    public void input(Scanner scanner) {
        System.out.print("Enter program name: ");
        programName = scanner.next();
        System.out.print("Enter department name: ");
        department = scanner.next();
        System.out.print("Enter program duration (in years): ");
        duration = scanner.nextInt();
    }

    public void display() {
        System.out.println("Program Name: " + programName);
        System.out.println("Department Name: " + department);
        System.out.println("Duration: " + duration + " years");
    }
}
