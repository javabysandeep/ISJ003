public class TypeCasting {
    public static void main(String[] args) {
        //what, why, how, types
        // converting one data type value into another data type value.
        // when we assign smaller data type value to a bigger data type then

        byte b = 100;
        short s = b;//implicit type casting
        //implicit typecasting is done by compiler automatically.

        short shortValue = 100;
        byte byteValue = (byte) shortValue;// explicit typecasting
        //developer is responsible for explicit typecasting

    }
}
