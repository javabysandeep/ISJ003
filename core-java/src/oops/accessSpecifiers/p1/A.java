package oops.accessSpecifiers.p1;

public class A {
    private int a = 100;
    public int b = 200;
    protected int c = 300;
    int d = 400;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);//private
        System.out.println(a.b);//public
        System.out.println(a.c);//protected
        System.out.println(a.d);//default
    }
}
