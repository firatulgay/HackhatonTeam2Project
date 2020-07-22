package com.team2.domain;

/**
 * @author ozgeonec
 */
public class ProductDetails {
    private int id;
    private String brand;
    private String description;
    private double price;

    public ProductDetails(String brand, String description, double price) {
        this.brand = brand;
        this.description = description;
        this.price = price;
    }
    public ProductDetails(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
