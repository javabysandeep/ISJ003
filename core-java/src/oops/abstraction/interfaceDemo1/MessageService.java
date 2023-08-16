package oops.abstraction.interfaceDemo1;

public interface MessageService {
    //variables
    int a = 100;// by default variables are public static final

    //methods
    void sendMessage(String message); // by default methods are public abstract
    // void m2(){}
    static void m1(){
        System.out.println("Static methods are allowed from java 8 onwards");
    }

    default void m3(){
        System.out.println("default method is a new feature of java 8 ");
    }

    //constructor
    // MessageService(){}//CTE

    //blocks
    //{} : //instance blocks are not allowed
    //static {} //static blocks are not allowed

    //nested classes
    public static class Nested {
    } // by default nested classes are  public static
}
