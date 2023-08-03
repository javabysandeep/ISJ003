package classComponents.nestedClass;

public class P {
    static int x = 1000;
    static class Q{
        //non-static members
        int iv = 10;
        void im(){
            System.out.println("instance method of static nested class Q");
        }
        {
            System.out.println("instance block of static nested class Q");
        }
        Q(){
            System.out.println("constructor of static nested class Q");
        }
        class Inner{}

        //static members
        static int sv = 100;
        static void sm(){
            System.out.println("static method of static nested class Q");
        }
        static {
            System.out.println("static block of static nested class Q");
        }
        static class NestedNested{}
    }

    public static void main(String[] args) {

        //static block of static nested class Q
        // access members of Nested static class Q
        System.out.println(P.x);//1000

        System.out.println(P.Q.sv);//100
        P.Q.sm();//Q class static method

        //how to access instance members of a static nested class
        P.Q qReference = new P.Q();
        System.out.println(qReference.iv);
        qReference.im();
    }
}
