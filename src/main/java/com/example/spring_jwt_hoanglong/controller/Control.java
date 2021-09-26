package com.example.spring_jwt_hoanglong.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring_jwt_hoanglong.service.UserService;
import com.example.spring_jwt_hoanglong.entity.User;
@RestController
public class Control {
    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        return userservice.createUser(user);
    }
}
