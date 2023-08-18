package java8features.defaultMethods;

public interface MessageService2 {
    default void sendMessage() {
        System.out.println("sending message using facebook");
    }
}
