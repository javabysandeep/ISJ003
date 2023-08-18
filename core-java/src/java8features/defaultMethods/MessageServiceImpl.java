package java8features.defaultMethods;

public class MessageServiceImpl implements MessageService{

    @Override
    public void sendMessage() {
        //MessageService.super.sendMessage();
        System.out.println("Sending message using whatsApp");
    }
}
