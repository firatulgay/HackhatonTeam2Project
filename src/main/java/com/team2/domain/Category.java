package com.team2.domain;

import javax.persistence.*;

@Entity
public class Category {
    @SequenceGenerator(name = "generator", sequenceName = "SBS_ADRES_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    @Column
    private int id;

    @Column
    private String categoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
