package classComponents.nestedClass;

public class Outer {

    //static nested class
    static class A {
        //non-static members
        int iv = 10;
        void im(){}
        {}
        class Inner{}

        //static members
        static int sv = 100;
        static void sm(){}
        static {}
        static class NestedNested{}
    }

    // non-static nested class or inner class
    class B {
        //non-static members
        int iv = 10;
        void im(){}
        {}
        class Inner{}

        //static members ae not allowed
       /* static int sv = 100;
        static void sm(){}
        static {}
        static class NestedNested{}*/
    }

    public static void main(String[] args) {
        //local inner class
        class LocalInnerClass {
            //non-static members
            int iv = 10;
            void im(){}
            {}
            class Inner{}

            //static members are not allowed
           /* static int sv = 100;
            static void sm(){}
            static {}
            static class NestedNested{}*/
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();//ib, con

        //iv, im, con, ib
        System.out.println(localInnerClass.iv);
        localInnerClass.im();
    }
}
