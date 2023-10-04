package com.example.demo.Controller;

import com.example.demo.Entity.Product;
import com.example.demo.Service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }
    @GetMapping()
    public List<Product> getAll(){
        return productService.getAllProduct();
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return productService.getById(id);

    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        productService.delete(id);
    }
    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PutMapping("/product")
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }
}
