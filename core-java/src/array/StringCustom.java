package array;

public class StringCustom {
    public static void main(String[] args) {
        String str = "good morning";
        char[] charArray = {'a', 'b', 'c'};
        System.out.println("Is Array empty " + isEmpty(charArray));
        System.out.println("contains " + contains(charArray, 'c'));
    }

    private static boolean contains(char[] charArray, char key) {
        boolean isPresent = false;
        for (char ch : charArray) {
            if (key == ch) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }

    public static boolean isEmpty(char[] charArray) {
        return charArray != null && charArray.length == 0;
    }

}
