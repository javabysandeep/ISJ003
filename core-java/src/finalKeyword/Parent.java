package finalKeyword;

public abstract /*final*/ class Parent {
   final void m1(){
        System.out.println("m1 method of parent class");
    }
    /*final */abstract void m2();
    final class Inner {}
}
