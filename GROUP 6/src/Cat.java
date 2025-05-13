// Another child class
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(name + " meows");
    }
}
