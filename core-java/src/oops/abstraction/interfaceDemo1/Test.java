package oops.abstraction.interfaceDemo1;

public class Test {
    public static void main(String[] args) {
        System.out.println("Accessing the static members of an interface");
        System.out.println(MessageService.a);
        MessageService.m1();

        //we cannot create object of an interface
        //MessageService ref = new MessageService();
        MessageService ref = new MessageServiceImpl();
        ref.m3();
        ref.sendMessage("hi");
    }
}
