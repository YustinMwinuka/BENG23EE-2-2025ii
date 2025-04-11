import java.util.Scanner;
 class StudentInfo {
     String name;
     int age;
     String regNumber;

     StudentInfo(int age,String name,String regNumber){
         this.name=name;
         this.age=age;
         this.regNumber=regNumber;
     }
     void displaystudentinformation(){
         System.out.println("\n student info");
         System.out.println("Name:" +name);
         System.out.println("Age:"+age);
         System.out.println("Reegistration number:"+regNumber);
     }
 }
 class StudentCourse{
     String cousreName;
     StudentCourse(String cousreName){
         this.cousreName=cousreName;
     }
     void displaycourseInfo(){
         System.out.println("student course information:"+cousreName);
     }
 }
 public class StudentInformation{
     public  static  void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int choice;
         System.out.println("welcome");
         System.out.println("1.student information");
         System.out.println("2.student course");
         System.out.println("Enter your option:");
         choice=sc.nextInt();
         sc.nextLine();
         switch (choice){
             case 1:
                 System.out.print("enter your name:");
                 String name= sc.nextLine();
                 System.out.println("enter the age:");
                 int age=sc.nextInt();
                 sc.nextLine();
                 System.out.println(" enter your registration:");
                 String regNo =sc.nextLine();
                 StudentInfo student =new StudentInfo(age, name,regNo);
                 student.displaystudentinformation();
                 break;
             case 2:
                 System.out.print("enter the name of course");
                 String courseName= sc.nextLine();
                 StudentCourse course=new StudentCourse(courseName);
                 course.displaycourseInfo();
                 break;
             default:
                 System.out.println("invalid choice");
         }
         sc.close();
     }
 }







