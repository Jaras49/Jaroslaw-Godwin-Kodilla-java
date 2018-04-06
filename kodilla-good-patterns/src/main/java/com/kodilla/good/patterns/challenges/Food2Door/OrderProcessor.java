package com.kodilla.good.patterns.challenges.Food2Door;

import com.kodilla.good.patterns.challenges.Food2Door.couriers.CouriersService;
import com.kodilla.good.patterns.challenges.Food2Door.informationService.InformationService;
import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.Supplier;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private List<Supplier> suppliers;
    private InformationService informationService;
    private CouriersService couriersService;

    public OrderProcessor(InformationService informationService) {
        suppliers = new ArrayList<>();
        suppliers.add(new ExtraFoodShop());
        suppliers.add(new GlutenFreeShop());
        this.informationService = informationService;
        this.couriersService = new CouriersService();
    }

    public OrderDto process(Order order) {
        Supplier supplier = getSupplier(order);
        boolean isProcesed = supplier.process(order);

        if(isProcesed) {
            informationService.inform(order.getUser());

            return new OrderDto(order, couriersService.getCourier(), true);
        }
        return new OrderDto(order, null, false);
    }

    private Supplier getSupplier(Order order) {
        for(Supplier s: suppliers) {
            if(s.isProcessable(order)){
                return s;
            }
        }
        return null;
    }
}
