package com.example.demo.Service;

import com.example.demo.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getById(Long id);
    Product update(Product product);
    void delete(Long id);
    Product addProduct(Product product);

}
