package org.example;

import org.example.controller.ProductController;
import org.example.model.Product;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        List<Product> products = productController.getAllProducts();
        products.forEach(System.out::println);

        System.out.println("Enter the product Id");
        Scanner scanner = new Scanner(System.in);
        int productId = scanner.nextInt();
        System.out.println("Product request for is "+productController.readProduct(productId));
    }
}
