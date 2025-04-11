public class Student {
    String name;
    String registrationNumber;
    int age;
    String status;

    Student(String name, String registrationNumber, int age, String status){
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.age = age;
        this.status = status;
    }
    void displayStudent() {
        System.out.println("Name: "+name);
        System.out.println("Registration Number: "+registrationNumber);
        System.out.println("Age: "+age);
        System.out.println("Status: "+status);
    }
}
