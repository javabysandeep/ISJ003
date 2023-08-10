package oops.polymorphism.methodOverloading;

public class PrivateMethodOverloading {
    private void m1(int a) {
        System.out.println(a);
    }

    private void m1(String a) {
        System.out.println(a);
    }

    private void m1(float a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        PrivateMethodOverloading ref = new PrivateMethodOverloading();
        ref.m1(10);
        ref.m1("abc");
        ref.m1(10.0f);
    }
}
