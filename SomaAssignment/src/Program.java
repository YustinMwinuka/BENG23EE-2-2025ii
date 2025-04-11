public class Program {
    private String programName;
    private int duration;
    private String department;

    public void
    input(java.util.Scanner scanner){
        System.out.print("Enter program name: ");
        programName=scanner.nextLine();
        System.out.print("Enter duration(in years): ");
        duration=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter department: ");
        department=scanner.nextLine();
    }
    public void display(){
        System.out.println("\n---Program Information---");
        System.out.println("Program Name: "+ programName);
        System.out.println("Duration: " + duration + "years");
        System.out.println("Department: " + department);
    }
}
