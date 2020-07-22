package com.team2.service;

import com.team2.domain.Category;
import com.team2.domain.Product;
import com.team2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ozgeonec
 */
@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Iterable<Category> getCategories(){
        return categoryRepository.findAll();
    }


}
