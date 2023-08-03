package oops.p1;

public class C {
    public static void main(String[] args) {
        A a = new A();
        //System.out.println(a.a);//private
        System.out.println(a.b);//public
        System.out.println(a.c);//protected
        System.out.println(a.d);//default
    }
}
