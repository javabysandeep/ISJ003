package oops.abstraction.interfaceDemo1.defaultMethods;

public interface I {
    void m1();
    default void m2(){
        System.out.println("its a default implementation for all the subclasses");
    }
}
