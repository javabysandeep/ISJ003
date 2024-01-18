package org.example.controller;

import org.example.model.Product;
import org.example.service.ProductService;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductService();

    public void createProduct(Product product) {
        productService.createProduct(product);
    }

    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    public void deleteProduct(int productId) {
        productService.deleteProduct(productId);
    }

    public Product readProduct(int productId) {
        return productService.readProduct(productId);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
