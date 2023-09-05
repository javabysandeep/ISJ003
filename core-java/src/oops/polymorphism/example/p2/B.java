package oops.polymorphism.example.p2;

import oops.polymorphism.example.p1.A;

public class B extends A {
    @Override
    public void display() {
        System.out.println("A class : display()");
    }

    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
