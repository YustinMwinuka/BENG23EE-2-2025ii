public class PROGRAM {
    String name;
    int duration;
    String department;

    // Constructor
    public PROGRAM(String name, int duration, String department) {
        this.name = name;
        this.duration = duration;
        this.department = department;
    }

    // Display program information
    public void displayInfo() {
        System.out.println("\n--- Program Information ---");
        System.out.println("Name: " + name);
        System.out.println("Duration: " + duration + " years");
        System.out.println("Department: " + department);
    }
}
