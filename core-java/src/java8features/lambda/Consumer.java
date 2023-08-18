package java8features.lambda;

public interface Consumer<T> {
    void accept(T t);

    public static void main(String[] args) {
        Consumer<String> stringConsumer = input -> System.out.println(input);
        stringConsumer.accept("Good morning");

        Consumer<Integer> integerConsumer = input -> System.out.println(input * input);
        integerConsumer.accept(10);
    }
}
