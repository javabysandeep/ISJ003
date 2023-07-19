package classComponents.variables;

import java.util.Arrays;

public class HelloVariables {

    int a = 100; // Primitive Instance variable
    String b = "Hi"; // Reference Instance variable

    static int c = 200; // Primitive static variable
    static String d = "Hello"; // Reference Static variable

    public static void main(String[] args) {
        //args : is an reference local variable
        int e = 300;  // Primitive Local variable
        String f = "Greetings"; //Reference Local variable
        System.out.println();
    }

    int add(int number1, int number2) {
        //Primitive local variable
        return number1 + number2;
    }


}