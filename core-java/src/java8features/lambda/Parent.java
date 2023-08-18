package java8features.lambda;

abstract public class Parent {
    void m1(){
        System.out.println("Parent m1");
    }
    abstract void m2();

    public static void main(String[] args) {
       Parent parent = new Child();

      Parent  ref = new Parent(){
          @Override
          void m1() {
              System.out.println("m1 method anonymous class");
          }

          @Override
          void m2() {
              System.out.println("m2 method anonymous class");
          }
      };
      parent.m1();
      parent.m2();

      ref.m1();
      ref.m2();
    }
}

