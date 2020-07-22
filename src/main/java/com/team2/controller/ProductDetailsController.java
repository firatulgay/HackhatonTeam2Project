package com.team2.controller;

import com.team2.domain.ProductDetails;
import com.team2.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ozgeonec
 */
@RestController
public class ProductDetailsController {

    @Autowired
    ProductDetailsService productDetailsService;

    @GetMapping("/productDetails/{id}")
    public ProductDetails getProductDetailsById(@PathVariable("id")int id){
        return productDetailsService.findById(id);
    }

    @GetMapping("/findByProductId/{id}")
    public ProductDetails getProductDetailsByProductId(@PathVariable("id") int id){
        return productDetailsService.findByProductId(id);
    }
}
