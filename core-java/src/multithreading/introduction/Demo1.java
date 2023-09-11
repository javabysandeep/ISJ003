package multithreading.introduction;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("who is executing the code : "+Thread.currentThread().getName()+" thread");
    }
}
