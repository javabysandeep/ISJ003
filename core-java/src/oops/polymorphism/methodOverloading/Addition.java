package oops.polymorphism.methodOverloading;

public class Addition {
    int add(int number1, int number2) {
        return number1 + number2;
    }

    float add(float number1, float number2) {
        return number1 + number2;
    }

   /* int add(float number1, float number2) {
        return (int)number1 + number2;
    }*/

    String add(String number1, String number2) {
        return number1 + number2;
    }
}
