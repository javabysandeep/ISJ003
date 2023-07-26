package classComponents.constructor;

public class Product {
    int productId;
    String productName;
    int productPrice;

    //zero parameterized : No-args constructor
    public Product  () {
    }

    //parameterized or all args constructor


    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public static void main(String[] args) {

        Product product1 = new Product();//no-args
        Product product2 = new Product(1, "Laptop", 1500000);//all-args
        System.out.println(product1.productId + "\t" + product1.productName + "\t" + product1.productPrice);
        System.out.println(product2.productId + "\t" + product2.productName + "\t" + product2.productPrice);
    }
}
