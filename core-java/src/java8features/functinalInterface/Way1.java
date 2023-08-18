package java8features.functinalInterface;

public class Way1 {
    public static void main(String[] args) {
        // way 1 : Traditional way to implement an interface
        I i = new Child();
        i.m1();

        // way 2 : using anonymous class
        I anonymous = new I() {
            @Override
            public void m1() {
                System.out.println("anonymous class m1 method");
            }
        };
        anonymous.m1();

        // way 3 : lambda expression since interface is a functional interface
        I lambda = () -> System.out.println("lambda m1 method");
        lambda.m1();

        // way 4 : method reference
        I methodRef = Way1::display;
        methodRef.m1();
    }
    public static void display(){
        System.out.println("printing some stuff..........");
    }
}
