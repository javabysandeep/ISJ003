package java8features.lambda;

public interface Predicate<X> {
    boolean test(X input);

    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Even test " + isEven.test(11));
        System.out.println("Even test " + isEven.test(10));

        Predicate<String> isNameSmall = name -> name.length() <= 5;
        System.out.println("Is my name small " + isNameSmall.test("IT Shaala"));
    }
}
