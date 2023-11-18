
package com.mahi.orderservice.controller;


import com.mahi.orderservice.entity.Item;
import com.mahi.orderservice.response.ResponseDataOrder;
import com.mahi.orderservice.service.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping("/")
    public Item saveItem(@RequestBody Item item){
        return itemService.saveItem(item);
    }

    @GetMapping("/{id}")
    public ResponseDataOrder getItemUser(@PathVariable("id") Long itemId) {
        return itemService.getItemUser(itemId);

    }

}
