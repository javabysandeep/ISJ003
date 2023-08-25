package stringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        // two objects  : heap   scp
        System.out.println("Object from HEAP " + System.identityHashCode(s1));
        System.out.println("Object from SCP " + System.identityHashCode(s2));
    }
}
