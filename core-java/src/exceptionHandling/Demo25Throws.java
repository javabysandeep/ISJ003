package exceptionHandling;

public class Demo25Throws {

    public static void main(String[] args) {
        try {
            loadClass();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }
        System.out.println("rest of the main method");
    }

    public static void loadClass() throws ClassNotFoundException {
        System.out.println("loading the class");
        Class.forName("exceptionHandling.A");
    }
}

class A {
    static {
        System.out.println("Class is loaded in the memory");
    }
}