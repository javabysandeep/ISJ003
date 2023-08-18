package java8features.lambda;

public interface Supplier<X> {
    X supply();

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "string data";
        System.out.println(supplier.supply());
    }
}
