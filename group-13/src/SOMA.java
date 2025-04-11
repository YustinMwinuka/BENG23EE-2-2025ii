import java.util.Scanner;
class SOMA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


PROGRAM P=new PROGRAM();
STUDENT S=new STUDENT();

        System.out.println("1-Student management system\n2-program management system\n");
        int choice=sc.nextInt();

       switch (choice){
            case 1:
                System.out.println("Student management system ");
                S.DisplayStudent();
                break;
            case 2:
                System.out.println("Program management system ");
                P.DisplayProgram();
                break;
            default:
                System.out.println("Invalid choice,Choose 1 or 2 only");
        }
    }
}

