package com.team2.dao;

import java.sql.SQLException;

public interface UserDao
{
    public boolean isValidUser(String name, String password) throws SQLException;
}
