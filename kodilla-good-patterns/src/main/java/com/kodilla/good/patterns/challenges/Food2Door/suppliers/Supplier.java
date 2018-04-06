package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;


public interface Supplier {

    boolean process(Order order);
    String showProducts();
    boolean isProcessable(Order order);
}
