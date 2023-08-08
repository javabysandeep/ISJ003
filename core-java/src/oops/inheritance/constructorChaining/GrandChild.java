package oops.inheritance.constructorChaining;

public class GrandChild extends Child {
    GrandChild() {
        this(10);
        System.out.println("Grand Child class zero param constructor");
    }

    GrandChild(int id) {
        super();
        System.out.println("Grand Child class zero param constructor");
    }
}
