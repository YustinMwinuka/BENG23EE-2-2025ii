
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       //object
        student obj= new student();
        program obj2 = new program();
      while (true){
        //choice part
        System.out.println("SELECT YOUR CHOICE");
        Scanner f = new Scanner(System.in);
        System.out.println("1. Enter students information \n"+"2. Enter program information  \n");
        int choice =f.nextInt();

        //switch
        switch(choice){
            case 1:{
                System.out.println("Enter student's NAME");
                Scanner s1 = new Scanner(System.in);
                obj.studentName=s1.nextLine();
                System.out.println("enter student REG NO.");
                Scanner s2 = new Scanner(System.in);
                obj.regnumber=s2.nextInt();
                System.out.println("enter student GENDER");
                Scanner s3 = new Scanner(System.in);
                obj.gender=s3.nextLine();
                System.out.println("enter student AGE");
                Scanner s4 = new Scanner(System.in);
                obj.age=s4.nextInt();
                obj.data1();
            }
            break;

            case 2:{
                System.out.println("Enter program NAME");
                Scanner s1 = new Scanner(System.in);
                obj2.programName=s1.nextLine();
                System.out.println("Enter program DEPERTMENT");
                Scanner s2 = new Scanner(System.in);
                obj2.depertmentName=s2.nextLine();
                System.out.println("Enter program CODE");
                Scanner s3 = new Scanner(System.in);
                obj2.programCode=s3.nextLine();
                System.out.println("enter program Credit");
                Scanner s4 = new Scanner(System.in);
                obj2.credit=s4.nextInt();
                obj2.data2();

            }
            break;

            default:{
                System.out.println("PLEASE ONLY SELECT THE CHOICES PROVIDED!");
            }}
        }

    }
}
