package com.mahi.orderservice.feignClient;


import com.mahi.orderservice.response.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "user-service", url = "http://localhost:8811/")
public interface UserClient {

    @GetMapping("/user/{userId}")
    public User findUserById(@PathVariable("userId") Long userId);

}
