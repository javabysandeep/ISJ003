package oops.polymorphism.methodOverloading;

public class FinalMethodOverloading {
    final void m1(int a) {
        System.out.println(a);
    }

    final void m1(String a) {
        System.out.println(a);
    }

    final void m1(float a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        FinalMethodOverloading ref = new FinalMethodOverloading();
        ref.m1(10);
        ref.m1("abc");
        ref.m1(10.0f);
    }
}
