package com.team2.service;

import com.team2.domain.Product;
import com.team2.domain.User;
import com.team2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ozgeonec
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(int id){
        return userRepository.findOne(id);
    }
    public User saveProduct(User user){
        return userRepository.save(user);
    }


}
