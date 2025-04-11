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
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Desc: " + desc);
    }
}
