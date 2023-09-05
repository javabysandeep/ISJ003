package exceptionHandling;

public class ClassNotFoundDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("exceptionHandling.Abcd");
    }
}

class Abc {
    static {
        System.out.println("abc class static block");
    }
}
