import java.util.Scanner;

public class SOMA {
    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.println("\nENTER CHOICE AMONG THESE:   \n1. Student Management \n2. Program Management \n3. Exit Program");
            number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Enter student name: ");
                    String name = sc.next();
                    System.out.println("Enter Student registration number");
                    String registrationNumber = sc.next();
                    System.out.println("Enter student age");
                    int age = sc.nextInt();
                    System.out.println("Enter Student status");
                    String status = sc.next();

                    Student s = new Student(name, registrationNumber, age, status);
                    s.displayStudent();
                    break;
                case 2:
                    System.out.println("Enter program name: ");
                    String programName = sc.next();
                    System.out.println("Enter program code: ");
                    String code = sc.next();
                    System.out.println("Enter program description: ");
                    String desc = sc.next();

                    Program p = new Program(programName, code, desc);
                    p.displayProgram();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
