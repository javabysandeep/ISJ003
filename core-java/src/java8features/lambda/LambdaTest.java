package java8features.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        NumberProcessor reference = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        System.out.println("Square "+reference.process(10));

        NumberProcessor reference2 = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number * number;
            }
        };
        System.out.println("Cube "+reference2.process(10));
    }
}
