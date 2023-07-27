package classComponents.block;

public class Demo1 {
    //does not have name, does not have access specifier, does not accept any input, does not return any output
    // at class level outside of all other components without static modifer
    //instance block

    {
        System.out.println("instance block");
    }

    //does not have name, does not have access specifier, does not accept any input, does not return any output
    // at class level outside of all other components with static modifier
    //instance block
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Demo1 demo1 = new Demo1();
        Demo1 demo2 = new Demo1();
        Demo1 demo3 = new Demo1();
        Demo1 demo4 = new Demo1();
    }
}
