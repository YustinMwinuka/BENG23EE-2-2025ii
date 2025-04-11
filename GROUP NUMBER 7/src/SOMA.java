import java.util.*;
public class SOMA {
    public static void main(String[] args) {
        try (Scanner number = new Scanner(System.in)) {

            System.out.println("WELCOME: Upload your details.");
            System.out.println("PLEASE, ENTER YOUR DETAILS IN CAPITAL LETTERS");
            System.out.println("PLEASE ENTER YOUR CHOICE:");
            System.out.println("OPTION 1: STUDENT PERSONAL INFORMATION");
            System.out.println("OPTION 2: PROGRAM SELECTED INFORMATION");

            int choice;
            choice = number.nextInt();
            switch (choice) {
                case 1:
                    Student m = new Student();
                    m.DisplayStudent();
                    break;
                case 2:
                    Program n = new Program();
                    n.DisplayProgram();
                    break;
                default:

            }


        }
    }
}
