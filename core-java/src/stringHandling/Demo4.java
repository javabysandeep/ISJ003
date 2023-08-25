package stringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String str = "Good";
        str = str.concat(" afternoon");
        System.out.println(str);//good afternoon
        str = str.concat(" good evening");
        System.out.println(str);//good afternoon good evening
    }
}
