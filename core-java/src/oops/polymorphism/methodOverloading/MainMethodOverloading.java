package oops.polymorphism.methodOverloading;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("JRE called main method");
        main();
    }

    public static void main() {
        System.out.println("Overloaded main method");
    }
}
