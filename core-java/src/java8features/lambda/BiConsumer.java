package java8features.lambda;

public interface BiConsumer<X, Y> {
    void accept(X x, Y y);

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> integerBiConsumer = (x, y) -> System.out.println(x + y);
        integerBiConsumer.accept(100, 200);

        BiConsumer<String, String> stringBiConsumer = (x, y) -> System.out.println(x + y);
        stringBiConsumer.accept("Good ", "Afternoon");
    }
}
