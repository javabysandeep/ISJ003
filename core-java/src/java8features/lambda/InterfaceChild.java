package java8features.lambda;

public class InterfaceChild implements I {
    @Override
    public void m1() {
        System.out.println("Interface child m1");
    }

    public static void main(String[] args) {
        I ref1 = new InterfaceChild();
        ref1.m1();

        I ref2 = new I() {
            @Override
            public void m1() {
                System.out.println("anoymous child m1");
            }
        };
        ref2.m1();
    }
}
