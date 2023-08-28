package stringHandling;

public class Demo20 {
    public static void main(String[] args) {
        String string = "greetings";
        StringBuffer stringBuffer = new StringBuffer(string);
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder);

        String str2 = new String(stringBuffer);
        String str3 = new String(stringBuilder);
        System.out.println(str2);
        System.out.println(str3);
    }
}
