package classComponents.assignments;

public class A {
   static void m1() {
        System.out.println("m1");
        m2();
    }

    static void m2() {
        System.out.println("m2");
        m3();
    }

   static void m3() {
        System.out.println("m3");
        m4();
    }

    static void m4() {
        System.out.println("m4");
    }

    public static void main(String[] args) {
        m1();
    }
}
