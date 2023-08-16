package oops.abstraction.abstractClassdemos;

public class Demo1 {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.a);
        System.out.println(Child.b);
        child.display();
    }
}
