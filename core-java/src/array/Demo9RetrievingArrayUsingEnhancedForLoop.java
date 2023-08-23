package array;

public class Demo9RetrievingArrayUsingEnhancedForLoop {
    public static void main(String[] args) {
        char[] greetings = {'G', 'o', 'o', 'd', ' ', 'm', 'o', 'r', 'n', 'i', 'n', 'g'};
        for (char ch : greetings) {
            System.out.print(ch);
        }
        System.out.println();

        String greetingMessage = "Good morning";
        char[] greetingMessageCharArray = greetingMessage.toCharArray();
        for (char ch : greetingMessageCharArray) {
            System.out.print(ch);
        }
    }
}
