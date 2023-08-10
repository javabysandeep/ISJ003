package oops.inheritance.constructorChaining;

public class C extends B {
    public C(int a){
        //call to the super class constructor
        super();
        System.out.println("C param constructor");
    }
    public C() {
        //there is call to the super class constructor
        this(10);
        System.out.println("C");
    }
}
