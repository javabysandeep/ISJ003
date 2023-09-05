package exceptionHandling;

public class Child extends Parent {
    @Override
    void display() throws ClassNotFoundException {
        System.out.println(10 / 0);
    }

    public static void main(String[] args) {
        Child child = new Child();
        //child.display();
    }
}
