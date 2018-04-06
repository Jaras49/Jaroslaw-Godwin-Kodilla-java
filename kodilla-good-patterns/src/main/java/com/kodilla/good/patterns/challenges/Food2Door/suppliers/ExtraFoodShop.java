package com.kodilla.good.patterns.challenges.Food2Door.suppliers;

import com.kodilla.good.patterns.challenges.Food2Door.order.Order;
import com.kodilla.good.patterns.challenges.Food2Door.product.Product;
import com.kodilla.good.patterns.challenges.Food2Door.suppliers.retriever.SuppliesRetriever;

import java.util.Map;
import java.util.stream.Collectors;

public class ExtraFoodShop implements Supplier {
    private String companyName = "ExtraFoodShop";
    private String adress = "xxxx";
    private String phoneNumber = "00000";

    @Override
    public boolean process(Order order) {
        Map<Product, Integer> extraFoodShopSupplies = SuppliesRetriever.getExtraFoodShopSupplies();

        for (Map.Entry entry: order.getOrder().entrySet()) {

            if(extraFoodShopSupplies.containsKey(entry.getKey())) {

                int orderedQuantity = (int) entry.getValue();
                int availableQuantity =  extraFoodShopSupplies.get(entry.getKey());

                if(availableQuantity >= orderedQuantity) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String showProducts() {
        return companyName + " offer:" + "\n" +
                SuppliesRetriever.getExtraFoodShopSupplies().entrySet().stream()
                .map(n -> n.getKey() + " quantity " + n.getValue())
                .collect(Collectors.joining("\n"));
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean isProcessable(Order order) {
        return "ExtraFoodShop".equals(order.getSupplier());
    }
}
