package com.kodilla.good.patterns.challenges.Food2Door.suppliers.retriever;

import com.kodilla.good.patterns.challenges.Food2Door.product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuppliesRetriever {

    public static Map<Product, Integer> getExtraFoodShopSupplies() {

        Map<Product, Integer> availableProducts = new HashMap<>();
        availableProducts.put(new Product("Chleb żytni", "szt", 2), 99);
        availableProducts.put(new Product("Piwko jasne pełne", "szt", 4), 99);

        return availableProducts;
    }

    public static List<Product> getGlutenFreeShopSupplies() {
        List<Product> availavleProducts = new ArrayList<>();
        availavleProducts.add(new Product("Chleb bez glutenu", "szt", 5));

        return availavleProducts;
    }
}
