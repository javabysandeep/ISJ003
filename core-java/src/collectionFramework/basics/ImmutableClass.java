package collectionFramework.basics;

public class ImmutableClass {
    public static void main(String[] args) {
        final class A {
            private int instanceVariable = 100;

            A() {
            }

            A(int instanceVariable) {
                this.instanceVariable = instanceVariable;
            }

            public int getInstanceVariable() {
                return instanceVariable;
            }


        }
//class B extends  A {}
        A a = new A(600);
        //   a.setInstanceVariable(100);
        System.out.println(a.getInstanceVariable());
    }
}

