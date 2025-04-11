package Student;
public class Student {

    String name;

    String registrationNumber;

    int age;

    String gender;

    String status;

    public Student() {}
    void DisplayStudent(){
        System.out.println("Student Name:" + name);
        System.out.println("Student Registration Number:" + registrationNumber);
        System.out.println("Student Age:" + age);
        System.out.println("Student Gender:" + gender);
        System.out.println("Student Status:" + status);
    }

}
