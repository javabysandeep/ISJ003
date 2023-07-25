package classComponents.constructor;

public class C {
    byte value1;
    short value2;
    int value3;
    long value4;
    float value5;
    double value6;
    char value7;
    boolean value8;
    String value9;

    //no-args constructor -: zero parameterized constructor

    public C() {
        System.out.println("This is zero parameterized");
    }

    //all-args constructor -: all parameterized constructor


    public C(byte v1, short v2, int v3, long v4,
             float v5, double v6, char v7, boolean v8, String v9) {
        //we assigned local variable value to instance variable
        value1 = v1;
        value2 = v2;
        value3 = v3;
        value4 = v4;
        value5 = v5;
        value6 = v6;
        value7 = v7;
        value8 = v8;
        value9 = v9;

    }

    public static void main(String[] args) {
        C c1 = new C((byte) 5, (short) 0, 0, 0, 0.0f, 0.0, ' ', false, "hello");// param constructor
        C c2 = new C((byte) 6, (short) 0, 0, 0, 0.0f, 0.0, ' ', false, "hello");// param constructor
        C c3 = new C((byte) 7, (short) 0, 0, 0, 0.0f, 0.0, ' ', false, "hello");// param constructor
    }
}
