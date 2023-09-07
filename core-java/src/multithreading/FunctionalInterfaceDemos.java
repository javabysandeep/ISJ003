package multithreading;

public class FunctionalInterfaceDemos {
    public static void main(String[] args) {
        //1. traditional way
        I i1 = new Subclass();
        i1.m1();

        //2. anonymous class way
        I i2 = new I() {
            @Override
            public void m1() {
                System.out.println("anonymous m1 method");
            }
        };
        i2.m1();

        //3. lambda expression
        I i3 = () -> System.out.println("lambda expression : m1 method");
        i3.m1();

        //4. method reference
        I i4 = FunctionalInterfaceDemos::display;
        i4.m1();

    }

    public static void display() {
        System.out.println("Hello");
    }
}

interface I {
    void m1();
}

class Subclass implements I {
    @Override
    public void m1() {
        System.out.println("Subclass m1 method");
    }
}
