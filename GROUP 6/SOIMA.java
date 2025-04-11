import java.util.Scanner;

public class SOIMA {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. STUDENT");
            System.out.println("2. PROGRAM");
            System.out.print("Enter your choice (1 or 2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter STUDENT name: ");
                    String STUDENTName = scanner.nextLine();
                    System.out.print("Enter STUDENT registrationnumber: ");
                    String STUDENTRegistrationnumber = scanner.nextLine();
                    System.out.print("Enter STUDENT age: ");
                    int STUDENTAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter STUDENT gender: ");
                    String STUDENTGender = scanner.nextLine();
                    System.out.print("Enter STUDENT status: ");
                    String STUDENTStatus = scanner.nextLine();

                    STUDENT STUDENT = new STUDENT(STUDENTName, STUDENTRegistrationnumber, STUDENTAge, STUDENTGender, STUDENTStatus);
                    STUDENT.displayInfo();
                    break;

                case 2:
                    System.out.println("Enter PROGRAM name: ");
                    String PROGRAMName = scanner.nextLine();
                    System.out.println("Enter PROGRAM code: ");
                    String PROGRAMCode = scanner.nextLine();

                    PROGRAM PROGRAM = new PROGRAM(PROGRAMName, PROGRAMCode);
                    PROGRAM.displayInfo();
                    break;

                default:
                    System.out.println("Invalid choice. please choose 1 or 2.");
            }
        }
    }
}