package com.team2.domain;

import jdk.jfr.Category;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
public class Product {
    @SequenceGenerator(name = "generator", sequenceName = "SBS_ADRES_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    private int id;
    @Column
    private Category category;
    @Column
    private ProductDetails productDetails;
    @Column
    private String imageAsBase64;

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

    public String getImageAsBase64() {
        return imageAsBase64;
    }

    public void setImageAsBase64(String imageAsBase64) {
        this.imageAsBase64 = imageAsBase64;
    }
}
