import Program.Program;
import Student.Student;

import java.util.Scanner;

public class SOMA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        Program p = new Program();

        while (true) {
            System.out.print("Welcome:");
            System.out.println("Enter Your Choice:");
            System.out.println("Option 1:Students Management:");
            System.out.println("Option 2:Program Management:");

            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Student Management Panel:");
                    break;
            }

        }
    }
}