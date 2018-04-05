package com.kodilla.good.patterns.challenges.shop.orderrepository;

import com.kodilla.good.patterns.challenges.shop.order.Order;

public interface OrderRepository {

    void createOrder(Order order);
}
