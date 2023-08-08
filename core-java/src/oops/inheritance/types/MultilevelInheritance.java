package oops.inheritance.types;

public class MultilevelInheritance {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.x);//1
        System.out.println(c.y);//2
        System.out.println(c.z);//3
    }
}
