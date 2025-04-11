import java.util.Scanner;
 class StudentInfo {
     String name;
     int age;
     String registrationNumber;
     String idNumber;
     StudentInfo(String name, int age,String registrationNumber, String idNumber){
         this.name=name;
         this.age=age;
         this.registrationNumber=registrationNumber;
         this.idNumber=idNumber;
     }
     void displayStudentInfo(){
         System.out.println("\n Student information");
         System.out.println("Name:" +name);
         System.out.println("Age:"+age);
         System.out.println("Restration Number:"+ registrationNumber);
         System.out.println("ID number:" + idNumber);
     }
}
class Course{
     String courseName;
     Course(String courseName){
         this.courseName=courseName;
     }
     void displayCourseInfo(){
         System.out.println("course information:" +courseName);
     }
}
public class Student{
     public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
         int choice;
         System.out.println("welcome to portal");
         System.out.println("1.Student info");
         System.out.println("2.Student course");
         System.out.print("Enter your choice:");
         choice=scanner.nextInt();
         scanner.nextLine();
         switch (choice) {
             case 1:
             System.out.print("enter name:");
             String name = scanner.nextLine();
             System.out.print("enter age:");
             int age = scanner.nextInt();
             scanner.nextLine();
             System.out.print("enter registration number:");
             String regNo = scanner.nextLine();
             System.out.println("enter IdD number:");
             String idNo = scanner.nextLine();
             StudentInfo student = new StudentInfo(name, age, regNo, idNo);
             student.displayStudentInfo();
             break;
             case 2:
                 System.out.print("Enter course name:");
                 String courseName = scanner.nextLine();
                 Course course = new Course(courseName);
                 course.displayCourseInfo();
                 break;
             default:
                 System.out.println("Invalid choice.");
                  }
                  scanner.close();
     }
}

