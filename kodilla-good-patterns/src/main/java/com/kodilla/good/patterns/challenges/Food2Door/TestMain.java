package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.couriers.CouriersService;
import com.kodilla.good.patterns.challenges.Food2Door.informationService.SmsInformationService;
import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.order.retriever.OrderRetriever;
import com.kodilla.good.patterns.challenges.Food2Door.product.Product;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.Food2Door.user.User;

public class TestMain {

    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        String s = extraFoodShop.showProducts();
        System.out.println(s);

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        String showProducts = glutenFreeShop.showProducts();
        System.out.println(showProducts);

        OrderProcessor orderProcessor = new OrderProcessor(new SmsInformationService());
        orderProcessor.process(order);

        Order order1 = new Order(new User("Jarek", "Rabałbzich"), "GlutenFreeShop");
        order1.addProduct(new Product("Chleb bez glutenu", "szt", 5));
        orderProcessor.process(order1);

    }
}
