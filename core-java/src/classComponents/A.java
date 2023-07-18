package classComponents;

public class A {
    int instanceVariable = 1;
    static int staticVariable = 2;

    public static void main(String[] args) {
        int localVariable = 3;
        System.out.println("Local variable " + localVariable); //3
        System.out.println("Static variable " + A.staticVariable);//2

        A a = new A();
        System.out.println("Instance variable " + a.instanceVariable);//1
        System.out.println(a.staticVariable);//A.staticVariable
    }
}
