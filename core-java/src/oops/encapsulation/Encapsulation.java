package oops.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", 14000);
        System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getProductPrice());
    }
}
