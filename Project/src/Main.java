//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  while (true) {
   System.out.println("\n--- Information Menu ---");
   System.out.println("1. Student");
   System.out.println("2. Program");
   System.out.println("3. Exit");
   System.out.print("Choose an option (1, 2, or 3): ");

   int option = input.nextInt();
   input.nextLine(); // consume newline

   switch (option) {
    case 1:
     Student student = new Student();
     student.input(input);
     student.display();
     break;
    case 2:
     Program program = new Program();
     program.input(input);
     program.display();
     break;
    case 3:
     System.out.println("Exiting program...");
     return;
    default:
     System.out.println("Invalid option. Try again.");
   }
  }
 }
}
