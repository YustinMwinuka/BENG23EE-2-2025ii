public class PROGRAM {
    String name;
    String code;

    public PROGRAM(String name, String code){
        this.name = name;
        this.code = code;
    }
    public void displayInfo(){
        System.out.println("\n--- PROGRAM Information ---");
        System.out.println("name: " + name);
        System.out.println("code: " + code);
    }
}
