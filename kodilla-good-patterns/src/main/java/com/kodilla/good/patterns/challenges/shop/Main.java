package com.kodilla.good.patterns.challenges.shop;

import com.kodilla.good.patterns.challenges.shop.informationservice.MailInformationService;
import com.kodilla.good.patterns.challenges.shop.order.Order;
import com.kodilla.good.patterns.challenges.shop.order.retrieve.OrderRetriever;
import com.kodilla.good.patterns.challenges.shop.orderrepository.ProductOrderRepository;
import com.kodilla.good.patterns.challenges.shop.orderservice.ProductOrderService;

public class Main {

    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInformationService(),
                new ProductOrderService(), new ProductOrderRepository());

        orderProcessor.process(order);

    }
}
