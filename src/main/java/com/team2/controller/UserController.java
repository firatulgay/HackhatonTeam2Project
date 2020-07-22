package com.team2.controller;

import com.team2.domain.Product;
import com.team2.domain.User;
import com.team2.service.ProductService;
import com.team2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ozgeonec
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllProducts(){
        return userService.getUsers();
    }

}
