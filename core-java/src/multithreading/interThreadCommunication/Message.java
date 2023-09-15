package multithreading.interThreadCommunication;

public class Message {
    String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    synchronized void sendMessage() {
        System.out.println("message sent by " + Thread.currentThread().getName());
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Notified by the sender");
    }

    synchronized void receiveMessage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("message received by " + Thread.currentThread().getName());
        notify();
        System.out.println("Sender");
    }
}
