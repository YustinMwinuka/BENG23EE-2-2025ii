import java.util.Scanner;

public class Student {
    Scanner Sc=new Scanner(System.in);
    String name;
    int age;
    long reg;
   String gender;

  //  Student(){
    //    name="Mtani";
   //     age=19;
  //      reg=230141454973l;
   //     gender='M';
 //   }

    public void DisplayStudent(){
        System.out.println("Inter the Student Information");

        System.out.print("Student name : ");
        name=Sc.next();

        System.out.print("Student age : ");
          age=Sc.nextInt();

        System.out.print("Registration number : ");
        reg=Sc.nextLong();

        System.out.print("Student gender : ");
        gender=Sc.next();
        System.out.println("___________________________________________");




        System.out.println("ENTERED STUDENT INFORMATION");
        System.out.println(" Student name : "+name);
        System.out.println(" Student name : "+age);
        System.out.println(" Registration number : "+reg);
        System.out.println(" Student Gender : "+gender);
        System.out.println("*********************************************");



    }
}
