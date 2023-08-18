package anonymousClass;

public class AnonymousTest {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.m1();

        //create a child class in the same file and create the object
        // class definition + object creation
        Parent parent1 = new Parent() {
            @Override
            void m1() {
                System.out.println("method overridden inside the anonymous class");
            }
        };
        parent1.m1();
    }
}
