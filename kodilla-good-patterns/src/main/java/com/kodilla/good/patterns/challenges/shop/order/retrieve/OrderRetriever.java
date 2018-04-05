package com.kodilla.good.patterns.challenges.shop.order.retrieve;

import com.kodilla.good.patterns.challenges.shop.order.Order;
import com.kodilla.good.patterns.challenges.shop.product.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

public class OrderRetriever {

    public Order retrieve() {
        Order order = new Order(new User("Andrzej", "Nowak"));
        order.addProduct(new Product("Playstation3", 699));
        order.addProduct(new Product("Quaqe3 game", 100));
        order.addProduct(new Product("Quake3 game", 100));

        return order;
    }
}
