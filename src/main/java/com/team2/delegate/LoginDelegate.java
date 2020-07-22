package com.team2.delegate;

import com.team2.service.UserService;

import java.sql.SQLException;

public class LoginDelegate
{
    private UserService userService;

    public UserService getUserService()
    {
        return this.userService;
    }

    public void setUserService(UserService userService)
    {
        this.userService = userService;
    }

    public boolean isValidUser(String name, String password) throws SQLException
    {
        return userService.isValidUser(name, password);
    }
}
