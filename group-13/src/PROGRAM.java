import java.util.Scanner;
public class PROGRAM {
    Scanner sc = new Scanner(System.in);
    String code;
    String name;
    String learnt;
    public void DisplayProgram() {
        System.out.println("Enter the program information: ");
        System.out.print("Enter the program code: ");
        code = sc.next();
        System.out.print("Enter the program name: ");
        name = sc.next();
        System.out.print("Enter the program learnt: ");
        learnt = sc.next();
        System.out.println("-------------------");
        System.out.println("Enter the program information: ");
        System.out.print("Program code: " + code);
        System.out.print("Program name: " + name);
        System.out.print("Program learnt: " + learnt);
        System.out.println("---------------");
    }
}
