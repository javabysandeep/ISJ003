package oops.accessSpecifiers.p2;

import oops.accessSpecifiers.p1.A;

public class B {
    public static void main(String[] args) {
        A a = new A();
        //System.out.println(a.a);//private
        System.out.println(a.b); // public
        //System.out.println(a.c); //same package - protected
        //System.out.println(a.d); // same package - default
    }
}
