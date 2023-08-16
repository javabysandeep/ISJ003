package oops.abstraction.interfaceDemo1;

public class C implements B {
    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        C ref  = new C();
        ref.m1();
        ref.m2();
        
    }
}
