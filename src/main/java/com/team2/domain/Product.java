package com.team2.domain;


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
    @ManyToOne
    @JoinColumn(name = "cId")
    private Category category;
    @Column
    private String imageAsBase64;

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

    public String getImageAsBase64() {
        return imageAsBase64;
    }

    public void setImageAsBase64(String imageAsBase64) {
        this.imageAsBase64 = imageAsBase64;
    }
}
