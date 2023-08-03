package classComponents.nestedClass;

public class A {
    int x = 1111;

    class Inner {
        //non-static members
        int iv = 10;

        void im() {
            System.out.println("Inner  class instance method");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);//1111

        A.Inner inner = a.new Inner();
        System.out.println(inner.iv);
        inner.im();
    }
}
