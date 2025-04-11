import java.util.Scanner;

import java.util.Scanner;
public class Program {
    Scanner Sc=new Scanner(System.in);

    String code;
    String name;
    String learnt;


   // Program(){

       // code="GSU";
       // name="oop";
       // learnt="program formation";
  //  }

    public void DisplayProgram(){
       System.out.println("Enter the programe information");
        System.out.print("Enter the program code : ");
        code=Sc.next();

        System.out.print("Enter Program name : ");
        name=Sc.next();
        System.out.print("Enter  Program lesson :");
        learnt=Sc.next();

        System.out.println("____________________________________");

System.out.println("ENTERED PROGRAM INFORMATION");
        System.out.println(" Program name : "+name);
        System.out.println(" Program code : "+code);
        System.out.println(" Program lesson : "+learnt);
        System.out.println("*************************************");


        //MEMEBERS
        //MTANI CHAMBA MUGETA 230141454973
        //EMMANUEL KISIMA
        //BRAYANI
    }
}
