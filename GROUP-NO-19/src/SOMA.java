import java.util.Scanner;
public class SOMA {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);

        Student S=new Student();
        Program P=new Program();

while (true) {
    System.out.println("WELCOME TO DIT STUDENT MANAGEMENT SYSTEM");
    System.out.println("please select your choice");
    System.out.println("1-Student management system\n2-Program management system\n");

    int choice = Sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            S.DisplayStudent();
            break;
        case 2:
            System.out.println("PROGRAM MANAGEMENT SYSTEM");
            P.DisplayProgram();

            break;
        default:
            System.out.println("Invalid choice ,Choose 1 or 2 only");
            System.out.println("Have a nice day");
    }
}
    }
}
