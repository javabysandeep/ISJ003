package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ThrowableExceptionDemo {
    public static void main(String[] args) {
        try {
            m1();
            m2();
            m3();
            m4();
            m5();
            m6();
            m7();
        } catch (Throwable throwable) {
        }
    }

    public static void m1() throws ArrayIndexOutOfBoundsException {
    }

    public static void m2() throws SQLDataException {
    }

    public static void m3() throws NullPointerException {
    }

    public static void m4() throws NegativeArraySizeException {
    }

    public static void m5() throws StringIndexOutOfBoundsException {
    }

    public static void m6() throws ArithmeticException {
    }

    public static void m7() throws IOException {
    }
}
