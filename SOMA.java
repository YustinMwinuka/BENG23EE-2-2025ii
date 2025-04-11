import java.util.Scanner;

class SOMA{

public static void main(String[] args) {
    boolean running = true;
    while (running){
    int number;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter choice: \n1. Student Management\n2. Program Management\n3. Exit Program\n");
    number = sc.nextInt();

        switch (number) {
            case 1:
                String name;
                int age;
                String status;
                String registrationNumber;

                System.out.println(" Enter name: ");
                name = sc.next();
                System.out.println(" Enter age: ");
                age = sc.nextInt();
                System.out.println(" Enter status: ");
                status = sc.next();
                System.out.println(" Enter registration number: ");
                registrationNumber = sc.next();

                Student s = new Student(name, registrationNumber, age, status);
                s.displayStudent();
                break;

            case 2:
                String pname;
                String code;
                String desc;
                System.out.println("Enter name: ");
                pname = sc.next();
                System.out.println("Enter code: ");
                code = sc.next();
                System.out.println("Enter desc: ");
                desc = sc.next();

                Program P = new Program(pname, code, desc);
                P.displayProgram();
                break;
            case 3:
                running = false;
                break;
            default:
                System.out.println("Invalid input");
            }
        }
    }
}
