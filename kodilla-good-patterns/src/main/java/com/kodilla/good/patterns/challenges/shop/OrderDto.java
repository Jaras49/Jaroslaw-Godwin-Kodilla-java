package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.shop.order.Order;
import com.kodilla.good.patterns.challenges.shop.user.User;

public class OrderDto {
    private User user;
    private double price;
    private boolean processed;

    public OrderDto(Order order, boolean processed) {
        this.user = order.getUser();
        this.price = order.getPrice();
        this.processed = processed;
    }
}
