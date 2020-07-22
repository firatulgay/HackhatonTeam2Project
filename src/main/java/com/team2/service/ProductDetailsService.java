package com.team2.service;

import com.team2.domain.Product;
import com.team2.domain.ProductDetails;
import com.team2.repository.ProductDetailsRepository;
import com.team2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ozgeonec
 */
@Service
public class ProductDetailsService {
    @Autowired
    ProductDetailsRepository productDetailsRepository;

    public ProductDetails findById(int id){
        ProductDetails productDetail = productDetailsRepository.findOne(id);
        return productDetail;
    }

    //Get product details from productid
    public ProductDetails findByProduct(int id){
        return productDetailsRepository.findByProductId(id);
    }
}
