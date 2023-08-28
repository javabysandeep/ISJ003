package objectClass;

public class Demo5Finalize {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method");
    }

    public static void main(String[] args) {
        Demo5Finalize ref = new Demo5Finalize();
        ref = null;
        System.gc();
    }
}
