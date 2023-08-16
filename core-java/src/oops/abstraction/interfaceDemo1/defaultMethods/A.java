package oops.abstraction.interfaceDemo1.defaultMethods;

public interface A {
    default void m1() {
        System.out.println("interface A m1 method");
    }

    void m2();
}
