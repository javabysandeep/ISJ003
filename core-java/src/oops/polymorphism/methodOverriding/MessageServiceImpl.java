package oops.polymorphism.methodOverriding;

public class MessageServiceImpl extends MessageService {
    @Override
   public void sendMessage(String m) {
        System.out.println("Sending message with whatsapp " + m);
    }
}
