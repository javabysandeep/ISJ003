package stringHandling;

public class Demo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // there will be only one object will be created inside the SCP
        //and both s1 and s2 will point to the same object
    }
}
