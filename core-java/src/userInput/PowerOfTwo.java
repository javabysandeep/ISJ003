package userInput;

public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(
                number > 0 && (number & number - 1) == 0
                        ? "Power of 2"
                        : "Not a power of 2"
        );
    }
}