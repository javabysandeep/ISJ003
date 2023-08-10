package oops.inheritance.superKeyword;

public class Child extends Parent{
    int x = 10;
    void m1(){
        super.m1();//calling super class instance method
        System.out.println("m1 method from Child class");
    }
    void display(){
        int x = 100;
        //local variable
        System.out.println(x);//100

        //instance variable
        System.out.println(this.x);

        //super class variable
        System.out.println(super.x);

    }
}
