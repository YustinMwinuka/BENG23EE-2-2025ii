import java.util.Scanner;
public class SOMA {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean running=true;
        while (running){
            System.out.println("\nMenu:");
            System.out.println("1. Enter Students Information");
            System.out.println("2. Enter program Information");
            System.out.println("3. Exist");
            System.out.println("Enter your choice: ");
            String input=scanner.nextLine();
            switch (input){
                case "1":
                    Student student=new Student();
                    student.input(scanner);
                    student.display();
                    break;
                case "3":
                    running=false;
                    System.out.println("Invalid choice! please try again");
            }
        }
        scanner.close();
    }
}
