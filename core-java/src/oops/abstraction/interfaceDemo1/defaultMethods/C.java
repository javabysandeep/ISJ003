package oops.abstraction.interfaceDemo1.defaultMethods;

public class C implements A, B{
    @Override
    public void m1() {
        A.super.m1();
        B.super.m1();
    }

    @Override
    public void m2() {

    }

    public static void main(String[] args) {
        C c = new C();
        c.m1();
    }
}
