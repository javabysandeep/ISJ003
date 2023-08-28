package objectClass;

public class Demo4ToString {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toOctalString(123));
        System.out.println(Integer.toHexString(123));

        Demo4ToString ref = new Demo4ToString();
        System.out.println(Integer.toHexString(ref.hashCode()));
        System.out.println(ref.getClass().getName() + "@" + Integer.toHexString(ref.hashCode()));
        System.out.println(ref);
        System.out.println(ref.toString());
    }
}
