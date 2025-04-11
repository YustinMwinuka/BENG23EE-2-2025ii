public class Program {
    String name;
    String code;
    String desc;

    Program(String name, String code, String desc) {
        this.name = name;
        this.code = code;
        this.desc = desc;
    }

    public void displayProgram() {
        System.out.println("\nPROGRAM INFORMATION");
        System.out.println("Program Name: " + name);
        System.out.println("Program Code: " + code);
        System.out.println("Program Description: " + desc);
    }
}
