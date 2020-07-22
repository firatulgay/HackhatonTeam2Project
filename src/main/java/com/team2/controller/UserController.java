package com.team2.controller;

import com.team2.Exceptions.UserNotFoundException;
import com.team2.domain.User;
import com.team2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ozgeonec
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userService.getUsers();
    }

    @GetMapping("/userLogin/{name}/{password}")
    public User getLogin(@PathVariable("name") String name, @PathVariable("password")String password){
        User user = userService.getLogin(name, password);

        if (user == null){
            throw new UserNotFoundException();
        }
        return user;
    }

}
