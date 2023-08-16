package oops.abstraction.abstractClassdemos;

public class C extends B {
    @Override
    void m1() {
        System.out.println("m1");
    }

    void m1(int a) {
        System.out.println("m1" + a);
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    void m3() {
        System.out.println("m3");
    }

}
