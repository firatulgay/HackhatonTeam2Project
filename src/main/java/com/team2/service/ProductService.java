package com.team2.service;

import com.team2.domain.Product;
import com.team2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ozgeonec
 */
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProduct(int id){
        return productRepository.findOne(id);
    }
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

}
