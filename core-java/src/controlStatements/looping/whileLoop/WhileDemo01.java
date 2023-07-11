package controlStatements.looping.whileLoop;

public class WhileDemo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        while (a > b) {
            System.out.println("while body");
        }
       /* for(;false;){
            System.out.println();
        }*/
       /* while (false){
            System.out.println();
        }*/
        System.out.println("Rest of the main");
    }
}
