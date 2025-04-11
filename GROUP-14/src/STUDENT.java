import java.util.Scanner;
public class STUDENT {
    Scanner sc = new Scanner(System.in);
    String name;
    String registationnumber;
    int age;
    String gender;

    public void DisplayStudent() {
        System.out.println("inter the student information");
        System.out.print("student name:");
        name = sc.next();
        System.out.println("student registationnumber:");
        registationnumber = sc.next();
        System.out.print("student age:");
        age = sc.nextInt();
        System.out.print("student gender:");
        gender = sc.next();
        System.out.println("-----------------------------");
        System.out.println("student details:");
        System.out.println("student name:" + name);
        System.out.print("student registationnumber:" + registationnumber);
        System.out.println("student age:" + age);
        System.out.print("student gender:" + gender);
        System.out.println("-----------------------------");
    }
}



