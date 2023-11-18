package com.mahi.orderservice.controller;



import com.mahi.orderservice.entity.Orders;
import com.mahi.orderservice.response.ResponseDataOrder;

import com.mahi.orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping("/")
    public Orders saveOrder(@RequestBody Orders order){
   return orderService.saveOrder(order);
    }
@GetMapping("/{id}")
public ResponseDataOrder getOrderUser(@PathVariable("id") Long orderId) {
     return orderService.getOrderUser(orderId);
}

}
