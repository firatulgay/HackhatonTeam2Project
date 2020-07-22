package com.team2.controller;

import com.team2.domain.Category;
import com.team2.domain.Product;
import com.team2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ozgeonec
 */
@RestController
public class CategoryController {
    @Autowired
    public CategoryService categoryService;

    @GetMapping("/categories")
    public Iterable<Category> getAllProducts() {
        return categoryService.getCategories();
    }

    @GetMapping("/saveCategory")
    public Category saveCategory(Category category) {
        return categoryService.saveCategory(category);
    }

    @GetMapping("/findCategoryById/{id}")
    public Category findCategoryById(int id) {
        return categoryService.getCategoryById(id);
    }
}
