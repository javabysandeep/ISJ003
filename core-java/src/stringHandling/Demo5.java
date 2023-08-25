package stringHandling;

public class Demo5 {
    public static void main(String[] args) {
        String str = "greetings";
        System.out.println("Length of the string  " + str.length());
        System.out.println("IS Empty " + str.isEmpty());

        //to uppercase
        str = str.toUpperCase();
        System.out.println(str);
    }
}
