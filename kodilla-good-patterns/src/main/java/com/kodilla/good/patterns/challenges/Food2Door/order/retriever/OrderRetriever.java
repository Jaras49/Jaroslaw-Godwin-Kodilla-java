package com.kodilla.good.patterns.challenges.Food2Door.order.retriever;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.product.Product;
import com.kodilla.good.patterns.challenges.Food2Door.user.User;

public class OrderRetriever {

    public Order retrieve() {
        Order order = new Order(new User("Andrzej", "Nowak"), "ExtraFoodShop");
        order.addProduct(new Product("Chleb żytni", "szt", 2));
        order.addProduct(new Product("Piwko jasne pełne", "szt", 4));

        return order;
    }
}
