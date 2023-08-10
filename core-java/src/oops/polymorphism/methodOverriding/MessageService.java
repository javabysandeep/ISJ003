package oops.polymorphism.methodOverriding;

public class MessageService {
    void sendMessage(String message) {
        System.out.println("Sending the message with email.." + message);
    }
    //private -> default -->protected --> public
}
