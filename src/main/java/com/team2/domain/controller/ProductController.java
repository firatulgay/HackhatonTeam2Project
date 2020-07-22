package com.team2.domain.controller;

import com.team2.domain.Product;
import com.team2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Iterable<Product> getAllProducts(){
        return productService.getProducts();
    }

}
