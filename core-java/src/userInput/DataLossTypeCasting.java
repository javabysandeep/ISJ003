package userInput;

public class DataLossTypeCasting {
    public static void main(String[] args) {
        short shortValue = 257;
        byte byteValue = (byte) shortValue;
        System.out.println("Byte value " + byteValue);

        char ch = '%';
        System.out.println(ch);//h
        System.out.println((int) ch);//unicode or ascii
        System.out.println('A' > 'A');//false

    }
}
