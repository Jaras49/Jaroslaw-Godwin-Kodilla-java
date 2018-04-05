package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.shop.informationservice.InformationService;
import com.kodilla.good.patterns.challenges.shop.order.Order;
import com.kodilla.good.patterns.challenges.shop.orderrepository.OrderRepository;
import com.kodilla.good.patterns.challenges.shop.orderservice.OrderService;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService,
                          OrderService orderService,
                          OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(Order order) {
        boolean isOrdered = orderService.order();

        if (isOrdered) {
            informationService.inform(order.getUser());
            orderRepository.createOrder(order);
            System.out.println("Order placed");
            return new OrderDto(order, true);
        }
        else {
            System.out.println("Upsss, something went wrong");
            return new OrderDto(order, false);
        }
    }
}
