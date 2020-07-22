package com.team2.controller;

import com.team2.domain.ProductDetails;
import com.team2.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ozgeonec
 */
@RestController
public class ProductDetailsController {

    @Autowired
    ProductDetailsService productDetailsService;

    @GetMapping("/productdetails/{id}")
    public ProductDetails getProductDetailsById(int id){
        return productDetailsService.findById(id);
    }
    @GetMapping("/productId/details")
    public ProductDetails getProductDetailsByProductId(int id){
        return productDetailsService.findByProduct(id);
    }
}
