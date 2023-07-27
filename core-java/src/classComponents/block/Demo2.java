package classComponents.block;

public class Demo2 {
    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block2");
    }

    static {
        System.out.println("static block1");
    }

    static {
        System.out.println("static block2");
    }

    Demo2() {
        //check 1 : is there any parent or super class constructor call
        // check 2: is there any instance block of the same class
        System.out.println("Zero param constructor");
    }

    public static void main(String[] args) {
        Demo2 demo1 = new Demo2();
        Demo2 demo2 = new Demo2();
    }
}
