package stringHandling;

public class Demo11 {
    public static void main(String[] args) {

        // do not use this solution : worst solution
        String name = "Salmaan";
        String reverseName = "";
        for (int index = name.length() - 1; index >= 0; index--) {
            reverseName = reverseName + name.charAt(index);
        }
        System.out.println(reverseName);
    }
}
