package com.kodilla.good.patterns.challenges.Food2Door.order;

import com.kodilla.good.patterns.challenges.Food2Door.product.Product;
import com.kodilla.good.patterns.challenges.Food2Door.user.User;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Product, Integer> order;
    private User user;
    private String supplier;

    public Order(User user, String supplier) {
        order = new HashMap<>();
        this.user = user;
        this.supplier = supplier;
    }

    public void addProduct(Product product) {
        order.putIfAbsent(product, 0);
        order.put(product, order.get(product) + 1);
    }

    public Map<Product, Integer> getOrder() {
        return order;
    }

    public User getUser() {
        return user;
    }

    public String getSupplier() {
        return supplier;
    }
}
