public class IsAlphabet {
    public static void main(String[] args) {
        char ch = 'z';
        System.out.println(
                ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                        ? "its alphabet"
                        : "its not a alphabet"
        );
    }
}
