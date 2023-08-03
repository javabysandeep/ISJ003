package classComponents.block;

public class A {
    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }

    A() {
        System.out.println("A class constructor");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
    }
}
