package com.example.demo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        String a =  resultSet.getString("ProductID");
        String b =  resultSet.getString("ProductName");
        String c =  resultSet.getString("Price");
        Integer d =  resultSet.getInt("Quantity");

        Product product = new Product();
        product.setProductID(a);
        product.setProductName(b);
        product.setPrice(c);
        product.setQuantity(d);
        return product;
    }
}
