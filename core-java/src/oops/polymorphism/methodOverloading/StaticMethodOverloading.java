package oops.polymorphism.methodOverloading;

public class StaticMethodOverloading {
    static void m1(int a) {
        System.out.println(a);
    }

    static void m1(String a) {
        System.out.println(a);
    }

    static void m1(float a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        m1(10);
        m1("abc");
        m1(10.0f);
    }
}
