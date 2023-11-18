package com.mahi.userservice.service;


import com.mahi.userservice.entity.User;
import com.mahi.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        System.out.println("request data from :"+user);
        User user1=userRepository.save(user);
        System.out.println("response data from db : "+user1);
     return user1;
    }

    public User findUserById(Long userId) {
        System.out.println("request getId from ui :" + userId);
        User user=userRepository.findUserByuserId(userId);
        System.out.println("response getId from db :" + user);
     return user;
    }

}
