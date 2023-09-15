package collectionFramework.basics;

public class WrapperClasses5 {
    public static void main(String[] args) {
        int number = 127;
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary conversion "+ binaryString);

        Integer integer = Integer.valueOf(binaryString);
        System.out.println("Integer value "+integer);

    }
}
