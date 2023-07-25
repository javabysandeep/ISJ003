package classComponents.constructor;

public class B {
    byte value1;
    short value2;
    int value3;
    long value4;
    float value5;
    double value6;
    char value7;
    boolean value8;
    String value9;

    B() {
        value1 = 100;
        value2 = 100;
        value3 = 100;
        value4 = 100;
        value5 = 100;
        value6 = 100;
        value7 = 100;
        value8 = true;
        value9 = "Dummy String value";
    }

    public static void main(String[] args) {
        B b1 = new B();//zero param constructor
        B b2 = new B();//zero param constructor
        B b3 = new B();//zero param constructor
        B b4 = new B();//zero param constructor
    }
}
