class Goat{
    void eat(){
        System.out.println("goat eat glass");
    }
}
class Cow extends Goat{
    void drink(){
        System.out.println("cow drink water");
    }
}
public class Animal {
    public static void main(String[] args){
        Cow myCow=new Cow();
        myCow.eat();
        myCow.drink();
    }
}
