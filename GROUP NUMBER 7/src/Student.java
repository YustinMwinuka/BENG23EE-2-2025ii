import java.awt.*;
import java.util.Scanner;

public class Student {

    public String studentName;
    public String studentGender;
    public String birthDate;
    public String nationality;
    public int studentAge;

    Student() {
        try (Scanner studentInfo = new Scanner(System.in)) {

            System.out.println("Enter student name: ");
            this.studentName = studentInfo.nextLine();

            System.out.println("Enter student gender: ");
            this.studentGender = studentInfo.nextLine();

            System.out.println("Enter student date of birth: ");
            this.birthDate = studentInfo.nextLine();

            System.out.println("Enter student nationality: ");
            this.nationality = studentInfo.nextLine();

            System.out.println("Enter student age: ");
            this.studentAge = studentInfo.nextInt();


        }
    }
        void DisplayStudent() {
            System.out.println("Student name: " + this.studentName);
            System.out.println("Student Gender: " + this.studentGender);
            System.out.println("Student date of birth: " + this.birthDate);
            System.out.println("Student nationality: " + this.nationality);
            System.out.println("Student Age: " + this.studentAge);

        }
    }

