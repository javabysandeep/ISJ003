package objectClass;

public class Demo3Equals {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(a == b);//false
        System.out.println(10 == 10);//true

        Demo3Equals ref1 = new Demo3Equals();
        Demo3Equals ref2 = new Demo3Equals();

        System.out.println(ref1 == ref2);//false
        System.out.println(ref1.equals(ref2));//false


    }
}
