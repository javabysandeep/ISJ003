package oops.accessSpecifiers;

public class Demo2 {
    private static int m = 299;

    public static void main(String[] args) {
        System.out.println(P.a);
        Demo2.P p = new Demo2.P();
        System.out.println(p.b);
    }

    private static class P {
        private static int a = 100;
        private int b = 200;

        public static void main(String[] args) {
            //accessing outer class members into nested class
            System.out.println(Demo2.m);
        }
    }
}
