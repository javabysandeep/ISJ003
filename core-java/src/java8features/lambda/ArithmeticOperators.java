package java8features.lambda;

public interface ArithmeticOperators {
    int add(int a, int b);

    public static void main(String[] args) {
        ArithmeticOperators ref = (x, y) -> x + y;
        System.out.println("Addition " + ref.add(10, 20));
    }
}
