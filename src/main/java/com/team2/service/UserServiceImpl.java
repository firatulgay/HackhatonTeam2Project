package com.team2.service;

import com.team2.dao.UserDao;
import com.team2.domain.User;

import java.sql.SQLException;

public class UserServiceImpl implements UserService
{

    private UserDao userDao;

    public UserDao getUserDao()
    {
        return this.userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }
    @Override
    public boolean isValidUser(String name, String password) throws SQLException
    {
        return userDao.isValidUser(name, password);
    }
    @Override
    public void save(User user) {

    }

    @Override
    public User findByName(String name) {
        return null;
    }
}
