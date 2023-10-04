package com.example.demo.Service;

import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    ProductRepo repository;


    public ProductServiceImpl(ProductRepo repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Product update(Product product) {
        Product productP = repository.findById(product.getId()).get();
        productP.setId(product.getId());
        productP.setName(product.getName());
        productP.setPrice(product.getPrice());
        return repository.save(productP);
    }

    @Override
    public void delete(Long id) {
    repository.deleteById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return repository.save(product);
    }
}
