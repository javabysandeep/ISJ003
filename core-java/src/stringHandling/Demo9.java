package stringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String str = "String handling is a powerful tool to manipulate strings";
        String[] words = str.split(" ");
        for (String word:words) {
            System.out.println(word);
        }
    }
}
