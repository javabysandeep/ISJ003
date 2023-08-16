package oops.abstraction.interfaceDemo1;

public class MessageServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("sending message");
    }
}
