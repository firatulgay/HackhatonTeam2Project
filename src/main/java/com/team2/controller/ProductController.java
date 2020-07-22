package com.team2.controller;

import com.team2.domain.Product;
import com.team2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author ozgeonec
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product findProductById(@PathVariable("id") int id) {
        return productService.findById(id);
    }

    @GetMapping("/saveProduct")
    public void saveProduct(Product product) {
        productService.saveProduct(product);
    }

    @GetMapping("/findProductByCategoryId/{id}")
        public List<Product> findProductsByCategoryId ( int id){
            return productService.findProductByCategoryId(id);
        }
    }


