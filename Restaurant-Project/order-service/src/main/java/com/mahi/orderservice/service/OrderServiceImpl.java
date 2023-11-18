package com.mahi.orderservice.service;

import com.mahi.orderservice.entity.Orders;
import com.mahi.orderservice.feignClient.UserClient;
import com.mahi.orderservice.repository.OrdersRepository;
import com.mahi.orderservice.response.ResponseDataOrder;
import com.mahi.orderservice.response.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class OrderServiceImpl  {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private UserClient userClient;

    public Orders saveOrder(Orders order) {
        return ordersRepository.save(order);

    }
    public ResponseDataOrder getOrderUser(Long orderId) {
        ResponseDataOrder responseDataOrder = new ResponseDataOrder();
        Orders order = ordersRepository.findOrderByorderId(orderId);
        User user = userClient.findUserById(order.getUserId());
        responseDataOrder.setOrder(order);
        responseDataOrder.setUser(user);
        return responseDataOrder;
    }
}


