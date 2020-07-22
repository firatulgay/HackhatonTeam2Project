package com.team2.domain;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    private int id;
    @Column
    private String brand;
    @Column
    private String description;
    @Column
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
