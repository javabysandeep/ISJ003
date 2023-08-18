package java8features.defaultMethods;

public interface MessageService {
    default void sendMessage() {
        System.out.println("sending message using email");
    }
}
