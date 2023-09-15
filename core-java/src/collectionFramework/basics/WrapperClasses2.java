package collectionFramework.basics;

public class WrapperClasses2 {
    public static void main(String[] args) {
        //unboxing : converting wrapper object into primitive type

        Byte b = 100;

        byte value = b;//unboxing
        System.out.println(value);
        System.out.println(b);

        byte b1 = Byte.parseByte("1");
        System.out.println(b1);

        byte b2 = Byte.parseByte("");
        short i = Short.parseShort("");
        int i1 = Integer.parseInt("");
        long l = Long.parseLong("");
        float v = Float.parseFloat("");
        double v1 = Double.parseDouble("");
        boolean b3 = Boolean.parseBoolean("");

    }
}
