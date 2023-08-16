package oops.abstraction.interfaceDemo1;

public class I1Child implements I1 {
    @Override
    public void m1() {
        System.out.println("m1 overridden in the child class");
    }

    public static void main(String[] args) {
        I1 ref = new I1Child();
        ref.m1();
    }
}
