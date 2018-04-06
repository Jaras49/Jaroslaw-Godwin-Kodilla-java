package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.product.Product;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.retriever.SuppliesRetriever;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GlutenFreeShop implements Supplier {
    private String companyName = "GlutenFreeShop";
    private String adress = "yyyy";
    private String phoneNumber = "99999";

    @Override
    public boolean process(Order order) {
        List<Product> glutenFreeShopSupplies = SuppliesRetriever.getGlutenFreeShopSupplies();
        Map<Product, Integer> orderedProducts = order.getOrder();

        for (Map.Entry entry : orderedProducts.entrySet()) {
            if(glutenFreeShopSupplies.contains(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String showProducts() {
        return companyName + " offer:" + "\n" +
                SuppliesRetriever.getGlutenFreeShopSupplies().stream()
                        .map(n -> n.toString())
                        .collect(Collectors.joining("\n"));
    }

    @Override
    public boolean isProcessable(Order order) {
        return "GlutenFreeShop".equals(order.getSupplier());
    }
}
