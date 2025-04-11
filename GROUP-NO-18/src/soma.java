import Program.Program;
import Student.Student;

import java.util.Scanner;

public class soma {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        Student s = new Student();
        Program p = new Program();

        while(true) {
            System.out.println(" wellcome :");
            System.out.println(" enter your choice :");
            System.out.println(" option 1: Student Management :");
            System.out.println(" option 2: program Management :");

            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1: System.out.println(" Student Management Panel :");
                 break;
            }
        }
    }
}