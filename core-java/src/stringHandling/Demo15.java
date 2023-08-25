package stringHandling;

public class Demo15 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("greetings");
        StringBuffer stringBuffer = new StringBuffer("greetings");

       // StringBuilder stringBuilder3 = "greetings";//CTE : literal way is not allowed


        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
