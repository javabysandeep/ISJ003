package oops.polymorphism.methodOverriding;

public class Demo1 {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("hi");//child

        MessageServiceImpl child = new MessageServiceImpl();
        child.sendMessage("hello");//child

        MessageService messageService1 = new MessageService();
        messageService1.sendMessage("test");//parent

    }
}
