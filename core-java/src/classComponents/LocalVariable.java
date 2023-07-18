package classComponents;

public class LocalVariable {
    int a = 100; // instance primitive variable
    static int b = 200; //static primitive variable

    public static void main(String[] args) {
        int a = 1000; // local primitive variable
        int b = 2000; // local primitive variable
        System.out.println(a);//1000
        System.out.println(b);//2000

        //print b : static primitive variable
        System.out.println("Static variable " + LocalVariable.b);

        // accessing the instance variable
        LocalVariable reference = new LocalVariable();
        System.out.println("Instance variable " + reference.a);
    }
}
