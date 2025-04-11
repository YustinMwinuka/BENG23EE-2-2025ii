public class STUDENT {
    String name;
    String registrationnumber;
    int age;
    String gender;
    String status;

    public STUDENT(String name, String registrationnumber, int age, String gender, String status) {
        this.name = name;
        this.registrationnumber = registrationnumber;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println("\n--- STUDENT Information ---");
        System.out.println("name: " + name);
        System.out.println("registrationnumber: " + registrationnumber);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("status: " + status);
    }





















 }

