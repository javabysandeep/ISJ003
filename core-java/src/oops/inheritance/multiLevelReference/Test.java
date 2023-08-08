package oops.inheritance.multiLevelReference;

public class Test {
    public static void main(String[] args) {
        P ref1 = new P();
        System.out.println(ref1.a);
        // System.out.println(ref1.b);//CTE
        //System.out.println(ref1.c); //CTE

        Q ref2 = new Q();
        System.out.println(ref2.a);
        System.out.println(ref2.b);
        //System.out.println(ref2.c);  //CTE

        R ref3 = new R();
        System.out.println(ref3.a);
        System.out.println(ref3.b);
        System.out.println(ref3.c);


        P ref4 = new R();
        System.out.println(ref4.a);
        //System.out.println(ref4.b);//CTE
        //System.out.println(ref4.c); //CTE

        Q ref5 = new R();
        System.out.println(ref5.a);
        System.out.println(ref5.b);
        //  System.out.println(ref5.c); //CTE

        P ref6 = new Q();
        System.out.println(ref6.a);
        // System.out.println(ref6.b);//CTE
        //System.out.println(ref6.c); //CTE
    }
}
