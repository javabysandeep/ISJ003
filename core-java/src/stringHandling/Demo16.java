package stringHandling;

public class Demo16 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("String");
        stringBuilder.append(" handling");
        stringBuilder.append(" is");
        stringBuilder.append(" a");
        stringBuilder.append(" best tool to work with character data");
        System.out.println(stringBuilder);


        stringBuilder.insert(0, "*** ");
        System.out.println(stringBuilder);
        stringBuilder.replace(0,5,"#");
        System.out.println(stringBuilder);

        StringBuilder name = new StringBuilder("Sandeep");
        System.out.println(name.reverse());
    }
}
