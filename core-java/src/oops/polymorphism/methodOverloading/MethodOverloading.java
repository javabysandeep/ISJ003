package oops.polymorphism.methodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(100, 200));
        System.out.println(addition.add(100.0f, 200.0f));
        System.out.println(addition.add("10", "20"));
    }
}
