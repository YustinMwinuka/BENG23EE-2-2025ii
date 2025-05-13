public class Graduate extends Person {
    String degree;

    public void inputGraduate(String name, int age, String degree) {
        input(name, age);  // Call superclass method
        this.degree = degree;
    }

    @Override
    public void display() {
        super.display();  // Call superclass display
        System.out.println("Degree: " + degree);
    }
}

