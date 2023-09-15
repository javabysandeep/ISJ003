package collectionFramework.basics;

public class WrapperClasses3 {
    public static void main(String[] args) {
        String str = "abc";
        int integerValue = Integer.parseInt(str);
        System.out.println(integerValue); //NumberFormatException

        //parseXXXX
        //valueOf
        Byte aByte = Byte.valueOf("1");
        Short aShort = Short.valueOf("2");
        Integer integer = Integer.valueOf("3");
        Long aLong = Long.valueOf("4");
        Float v = Float.valueOf("4");
        Double aDouble = Double.valueOf("5");
        Character c = Character.valueOf('c');
        Boolean aBoolean = Boolean.valueOf("true");


    }
}
