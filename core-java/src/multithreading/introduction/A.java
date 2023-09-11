package multithreading.introduction;

public class A {
    B target = null;

    A(B target) {
        this.target = target;
    }

    void method() {
        if (target != null) {
            target.method();
        }
    }

    public static void main(String[] args) {
        B b = new B();
        A a = new A(b);
        a.method();
    }
}
