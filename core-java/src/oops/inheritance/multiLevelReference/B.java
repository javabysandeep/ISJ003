package oops.inheritance.multiLevelReference;

public class B extends A {
    int p = 10;
    int q = 20;

    void display() {
        int p = 100;
        int q = 200;
        //local variable
        System.out.println(p);//100
        System.out.println(q);//200

        //same class instance variable
        System.out.println(this.p);//10
        System.out.println(this.q);//20

        //parent class instance variable
        System.out.println(super.p);//1
        System.out.println(super.q);//2
    }

    public static void main(String[] args) {
        B b = new B();
        b.display();
    }

}
