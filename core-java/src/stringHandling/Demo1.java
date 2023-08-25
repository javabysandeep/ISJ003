package stringHandling;

public class Demo1 {
    public static void main(String[] args) {
        String str1 = new String("greeting");// heap, scp
        String str2 = "greeting";//no object will be created.
        System.out.println(str1.toString());
        System.out.println(str2);

    }
}
