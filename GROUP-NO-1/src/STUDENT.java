public class STUDENT {
    private String name;
    private int age;
    private String regNo ;

    // Constructor
    public STUDENT (String name, int age, String regNo) {
        this.name = name;
        this.age = age;
        this.regNo = regNo;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("regN0: " + regNo);
    }
}
