package com.mahi.orderservice.repository;


import com.mahi.orderservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findItemByitemId(Long itemId);
}
