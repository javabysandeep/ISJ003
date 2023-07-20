package classComponents.assignments;

public class B {
    void m1(){}
    static void m2(){}

    void m3(){
        // call m1, m2
        m1();
        m2();

    }
    static void m4(){
        //call m1 m2
        B b = new B();
        b.m1();//
        m2();//s
    }
}
