package classComponents.block;

import java.time.LocalDateTime;

public class Order {
    int orderId;
    String orderName;
    static int orderCount = 0;
    {
        orderCount++;
        System.out.println("Order is placed at "+ LocalDateTime.now());
    }

    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        Order order5 = new Order();
        Order order6 = new Order();
        Order order7 = new Order();
        System.out.println("Total orders placed "+Order.orderCount);
    }
}
