package multithreading.interThreadCommunication;

public class MessageTest {
    public static void main(String[] args) {
        Message message = new Message("Good morning");
        Thread sender = new Thread(message::sendMessage, "sender");
        Thread receiver = new Thread(message::receiveMessage, "receiver");
        sender.start();
        receiver.start();
    }
}
