import java.util.Scanner;

public class Program {

    public String campSelected;
    public String programName;
    public String programDepartment;
    public int programDuration = 4;

    Program() {
        try (Scanner programInfo = new Scanner(System.in)) {

            System.out.println("Enter selected campus: ");
            this.campSelected = programInfo.nextLine();

            System.out.println("Enter program name: ");
            this.programName = programInfo.nextLine();

            System.out.println("Enter program Department: ");
            this.programDepartment = programInfo.nextLine();


        }
    }
        void DisplayProgram () {
            System.out.println("Selected Campus: " + this.campSelected);
            System.out.println("Program name: " + this.programName);
            System.out.println("Program Department: " + this.programDepartment);
            System.out.println("Program Duration: " + this.programDuration + " years");
        }
    }

