package com.team2.controller;

import com.team2.domain.Product;
import com.team2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

////yorum test için

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
   @GetMapping("/products/{id}")
   public Product retrieveProduct(int id){
      return productService.retrieveItem(id);
   }

}
