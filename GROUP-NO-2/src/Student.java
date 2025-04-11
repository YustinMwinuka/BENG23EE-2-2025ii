public class Student {
    String name;
    String registrationNumber;
    int age;
    String status;

    Student(String name, String registrationNumber, int age, String status) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.age = age;
        this.status = status;
    }

    void displayStudent() {
        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student name: " + name);
        System.out.println("Student registration Number" + registrationNumber);
        System.out.println("Student age: " + age);
        System.out.println("Student Status: " + status);
    }
}
