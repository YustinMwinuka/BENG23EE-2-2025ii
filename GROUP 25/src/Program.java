public class Program {
    String name;
    String code;
    String description;

    Program(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }

    public void displayProgram() {
        System.out.println(" Enter Name: " +name);
        System.out.println(" Enter Code: " +code);
        System.out.println(" Enter Description: " +description);
    }
}
