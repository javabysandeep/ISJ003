package stringHandling;

public class Demo14 {
    public static void main(String[] args) {
        String str1 = "good";
        String str2 = "Good";
        System.out.println(str1.equals(str2));//content: false
        System.out.println(str1.equalsIgnoreCase(str2));//content: true
        System.out.println(str1.indexOf('d'));
    }
}
