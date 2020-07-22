package com.team2.domain;

import javax.persistence.*;

/**
 * User
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
@Entity
public class User {

    @SequenceGenerator(name = "generator", sequenceName = "SBS_ADRES_ID_SEQ")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "generator")
    @Column
    private int id;

    @Column
    @Enumerated(EnumType.STRING)
    private EnumUserType enumUserType;

    @Column
    private String name;

    @Column
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnumUserType getEnumUserType() {
        return enumUserType;
    }

    public void setEnumUserType(EnumUserType enumUserType) {
        this.enumUserType = enumUserType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
