package classComponents.methods.differentClasses;

public class B {
    public static void main(String[] args) {

    }
    void m1(){
        // // A : IM, SM

        // A : IM, SM
        A.staticMethod();

        A a = new A();
        a.instanceMethod();
    }
}
