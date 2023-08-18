package java8features.lambda;

public interface BiPredicate<X, Y> {
    boolean test(X x, Y y);

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isMax = (x, y) -> x > y;
        System.out.println(isMax.test(100, 200));
    }
}
