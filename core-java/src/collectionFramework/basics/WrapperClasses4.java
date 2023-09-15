package collectionFramework.basics;

public class WrapperClasses4 {
    public static void main(String[] args) {
        int number = 127;
        System.out.println("Binary conversion " + Integer.toBinaryString(number));
        System.out.println("Octal conversion " + Integer.toOctalString(number));
        System.out.println("Hexadecimal conversion " + Integer.toHexString(number));
    }
}
