class Toyota{
    void Brand(){
        System.out.println("This car brand is toyota ist");
    }
}
class Mark_x extends Toyota{
    void Brand_2(){
        System.out.println("This car brand is also from toyota");
    }
}
public class Car {
    public static void main(String[] args){
        Mark_x myMark_x=new Mark_x();
        myMark_x.Brand();
        myMark_x.Brand_2();
    }
}
