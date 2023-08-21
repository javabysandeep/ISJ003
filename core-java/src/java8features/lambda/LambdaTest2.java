package java8features.lambda;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest2 {
    public static void main(String[] args) {
        Consumer consumer = input -> System.out.println(input);
        consumer.accept(100);

        Consumer<String> consumer2 = input -> System.out.println(input);
        consumer2.accept("string type");

        Supplier supplier = () -> "string supplied by supplier";
        System.out.println(supplier.get());

        Function<Integer, Integer> function = (input) -> input + input;
        System.out.println(function.apply(100));


        Predicate<Integer> predicate = input -> input % 2 == 0;
        System.out.println(predicate.test(100));

        Runnable runnable = () -> System.out.println("running");
        runnable.run();

        //positive= input1 is greater than input2
        // negative = input1 is less than input2
        // zero = equal
        //10,6,6,11,89
        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;
        System.out.println(comparator.compare(100, 100));

        Product product1 = new Product(101, "Mobile", 98000);
        Product product2 = new Product(101, "Laptop", 198000);

        Comparator<Product> productComparator = (p1, p2) -> p1.getProductId() - p2.getProductId();
        System.out.println(productComparator.compare(product1, product2));
    }
}
