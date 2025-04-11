
 public class Student{
    private String name;
    private int age;
    private String id;

    public void
    input(java.util.Scanner scanner){
        System.out.print("Enter student name: ");
        name =scanner.nextLine();
        System.out.print("Enter student age: ");
        age=Integer.parseInt(scanner.nextLine());
        System.out.print("Enter student ID:");
        id=scanner.nextLine();
}
public void display(){
        System.out.println("\n---Student information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }
}