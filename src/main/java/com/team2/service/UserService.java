package com.team2.service;

import com.team2.domain.User;

import java.sql.SQLException;

public interface UserService {
    boolean isValidUser(String name, String password) throws SQLException;

    void save(User user);
    User findByName(String name);
}
