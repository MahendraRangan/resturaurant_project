package com.mahi.orderservice.response;

import com.mahi.orderservice.entity.Item;
import com.mahi.orderservice.entity.Orders;

public class ResponseDataOrder {
   // private Order order;
    private Orders order;
    private Item item;
    private User user;
    private Product product;

    public ResponseDataOrder() {
    }

    public ResponseDataOrder(Orders order, Item item, User user, Product product) {
        this.order = order;
        this.item = item;
        this.user = user;
        this.product = product;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ResponseDataOrder{" +
                "order=" + order +
                ", item=" + item +
                ", user=" + user +
                ", product=" + product +
                '}';
    }
}
