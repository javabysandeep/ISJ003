package oops.polymorphism.methodOverloading;

public class ConstructorOverloading {
    public ConstructorOverloading() {
        System.out.println("zero param con");
    }

    public ConstructorOverloading(int a) {
        System.out.println("param con " + a);
    }

    public static void main(String[] args) {
        ConstructorOverloading ref1 = new ConstructorOverloading();
        ConstructorOverloading ref2 = new ConstructorOverloading(10);
    }
}
