package stringHandling;

public class Demo10 {
    public static void main(String[] args) {
        String string = "Suresh,Gaurav,Shubham,Salman,Amol,Saniya,Nikhat,Taru";
        String[] names = string.split(",");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
