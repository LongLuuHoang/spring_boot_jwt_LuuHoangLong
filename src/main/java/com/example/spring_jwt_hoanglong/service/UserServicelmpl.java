package com.example.spring_jwt_hoanglong.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.spring_jwt_hoanglong.repository.UserRepo;
import com.example.spring_jwt_hoanglong.entity.User;
public class UserServicelmpl implements UserService{
    @Autowired
    private UserRepo userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}
