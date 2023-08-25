package stringHandling;

public class Demo6 {
    public static void main(String[] args) {
        String str = "               hello";
        System.out.println(str.trim());

        String str2 = "IT Shaala";
        str2 = str2.replace('a', '@');
        System.out.println(str2);
    }
}
