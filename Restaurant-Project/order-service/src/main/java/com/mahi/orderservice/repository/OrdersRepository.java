package com.mahi.orderservice.repository;

import com.mahi.orderservice.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
    Orders findOrderByorderId(Long orderId);
}
