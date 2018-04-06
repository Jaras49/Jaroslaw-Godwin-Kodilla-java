package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.user.User;

public class OrderDto {
    private Order order;
    private User assignedCourier;
    private boolean isAssigned;

    public OrderDto(Order order, User assignedCourier, boolean isAssigned) {
        this.order = order;
        this.assignedCourier = assignedCourier;
        this.isAssigned = isAssigned;
    }

    public Order getOrder() {
        return order;
    }

    public User getAssignedCourier() {
        return assignedCourier;
    }
}
