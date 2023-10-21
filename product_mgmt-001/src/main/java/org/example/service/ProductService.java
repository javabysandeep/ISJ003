package org.example.service;

import org.example.dao.ProductDao;
import org.example.model.Product;

import java.util.List;

public class ProductService {
    ProductDao productService = new ProductDao();

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
