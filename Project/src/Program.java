import java.util.Scanner;

public class Program {
    private String programName;
    private int duration;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter program name: ");
        programName = scanner.nextLine();
        System.out.print("Enter program duration (in years): ");
        duration = scanner.nextInt();
        scanner.nextLine(); // consume newline
    }

    public void display() {
        System.out.println("Program Name: " + programName);
        System.out.println("Duration: " + duration + " years");
    }
}
