package com.mahi.userservice.controller;


import com.mahi.userservice.entity.User;
import com.mahi.userservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        System.out.println("request data "+user.toString());
        return userServiceImpl. saveUser(user);
    }
    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") Long userId){
        System.out.println("response data :"+userId.toString());
        return userServiceImpl.findUserById(userId);
    }

}
