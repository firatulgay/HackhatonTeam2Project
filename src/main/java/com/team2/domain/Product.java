package com.team2.domain;

import jdk.jfr.Category;

/**
 * @author ozgeonec
 */
public class Product {
    private int id;
    private Category category;
    private ProductDetails productDetails;

    public Product(Category category, ProductDetails productDetails) {
        this.category = category;
        this.productDetails = productDetails;
    }
    public Product(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }
}
