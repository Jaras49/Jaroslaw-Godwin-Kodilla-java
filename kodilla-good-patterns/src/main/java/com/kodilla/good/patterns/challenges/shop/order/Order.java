package com.kodilla.good.patterns.challenges.shop.order;

import com.kodilla.good.patterns.challenges.shop.product.Product;
import com.kodilla.good.patterns.challenges.shop.user.User;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> order;
    User user;

    public Order(User user) {
        order = new HashMap<>();
        this.user = user;
    }

    public Map<Product, Integer> getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }

    public void addProduct(Product product) {
        order.putIfAbsent(product, 0);
        order.put(product, order.get(product) + 1);
    }

    public double getPrice() {

        return order.entrySet().stream()
                .mapToDouble(n -> n.getKey().getPrice() * n.getValue())
                .sum();
    }
}
