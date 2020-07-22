package com.team2;

import com.team2.domain.Category;
import com.team2.domain.Product;
import com.team2.domain.ProductDetails;
import com.team2.repository.CategoryRepository;
import com.team2.repository.ProductDetailsRepository;
import com.team2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * App
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ProductDetailsRepository productDetailsRepository;

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

    }

    @Override
    public void run(String[] args) throws Exception {


    }
}
