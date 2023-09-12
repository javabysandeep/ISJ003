package multithreading.preventThreadExecution;

public class Demo5Chess {
    public static void main(String[] args) {
        Thread player1 = new Thread(()->{
            while (true){
                System.out.println(Thread.currentThread().getName());
            }
        },"player1");

        Thread player2 = new Thread(()->{
            while (true){
                try {
                    player1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());
            }
        },"player2");

        player1.start();
        player2.start();
    }
}
