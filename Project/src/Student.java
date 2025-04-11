import java.util.Scanner;

public class Student {
String name;
String studentId;

void input(){
    Scanner P = new Scanner(System.in);
    System.out.println("Student name: ");
    name = P.nextLine();
    System.out.println("StudentId: ");
    studentId = P.nextLine();
    P.nextLine();
}

void display(){
    System.out.println("Student name: " + name);
    System.out.println("StudentId: " + studentId);
}
}
