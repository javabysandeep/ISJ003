package classComponents.nestedClass;

public class LocalInnerClass {
    static class A {
        //instance specific
        int a = 100;

        void m1() {
            System.out.println("instance method of Static nested class");
        }

        A() {
            System.out.println("constructor of Static nested class");
        }

        {
            System.out.println("instance block of Static nested class");
        }

        //static variable, method, block, static nested class are  allowed
        static int b = 200;

        static {
            System.out.println("static block");
        }

        static void m2() {
        }

        static class E {
        }
    }

    class InnerClass {
        int a = 100;

        void m1() {
            System.out.println("instance method of Inner class");
        }

        InnerClass() {
            System.out.println("constructor of Inner class");
        }

        {
            System.out.println("instance block of Inner class");
        }

        //static variable, method, block, static nested class are not allowed
        /*static int b = 200;

        static {
        }

        static void m2() {
        }

        static class E {
        }*/
    }

    public static void main(String[] args) {
        //local inner class
        class A {

            //IV, IM, IB, Constructor
            int a = 100;
            //static int b = 200;

            void m1() {
                System.out.println("instance method of local inner class");
            }

            A() {
                System.out.println("constructor of local inner class");
            }

            {
                System.out.println("instance block of local inner class");
            }

            //static variable, method, block, static nested class are not allowed
           /* static int b = 200;
            static {}
            static void m2(){}
            static class E{}*/

        }
    }
}
