package oops.abstraction.interfaceDemo1.defaultMethods;

public class Test2 {
    public static void main(String[] args) {

        //anonymous class
        A ref = new A() {
            @Override
            public void m2() {

            }
        };

        //subclass creation
        A a = ()->{};
    }
}
