package multithreading.creatingSubclasses;

public class LocalInnerClass {
    public static void main(String[] args) {
         class MessageServiceImpl extends MessageService{ }
         MessageService messageService = new MessageServiceImpl();
         MessageService messageService1 = new MessageService(){};//anonymous class
    }
}
