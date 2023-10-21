package org.example.dao;

import org.example.model.Product;
import org.example.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    //crud
    public void createProduct(Product product) {
    }

    public void updateProduct(Product product) {
    }

    public void deleteProduct(int productId) {
    }

    public Product readProduct(int pId) {
        Product product = null;
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from product where product_id=" + pId);
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                String productDescription = resultSet.getString("product_desc");
                int productPrice = resultSet.getInt("product_price");
                product = new Product(productId, productName, productDescription, productPrice);
            }
        } catch (SQLException sqlException) {
            System.out.println("Sql exception");
        }
        return product;
    }

    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<Product>();
        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from product");
            while (resultSet.next()) {
                int productId = resultSet.getInt("product_id");
                String productName = resultSet.getString("product_name");
                String productDescription = resultSet.getString("product_desc");
                int productPrice = resultSet.getInt("product_price");
                Product product = new Product(productId, productName, productDescription, productPrice);
                productList.add(product);
            }
        } catch (SQLException sqlException) {
            System.out.println("Sql exception");
        }
        return productList;
    }

}
