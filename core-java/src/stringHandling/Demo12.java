package stringHandling;

public class Demo12 {
    public static void main(String[] args) {
        String name = "Salmaan";
        char[] charArray = name.toCharArray();
        for (int left = 0, right = charArray.length - 1; left < right; left++, right--) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }

        for (char ch:charArray) {
            System.out.print(ch);
        }

    }
}
