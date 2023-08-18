package anonymousClass;

public class AbcTest {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            void m1() {
                System.out.println("anonymous class m1 method");
            }
        };

        B b = new B() {

            @Override
            void m1() {
                System.out.println("anonymous class B: m1 method");
            }
        };

        C c = new C() {
            @Override
            public void m1() {
                System.out.println("anonymous class C: m1");
            }
        };

        a.m1();
        b.m1();
        c.m1();
    }
}
