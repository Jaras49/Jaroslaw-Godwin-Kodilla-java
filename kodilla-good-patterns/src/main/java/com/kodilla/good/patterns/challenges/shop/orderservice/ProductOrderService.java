package com.kodilla.good.patterns.challenges.shop.orderservice;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order() {

        System.out.println("Placing order");

        return true;
    }
}
