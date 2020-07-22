package com.team2.domain;

/**
 * User
 *
 * @author Fırat ÜLGAY
 * @since 5.230.0
 */
public class User {
    private int id;
    private EnumUserType enumUserType;
    private String name;
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
