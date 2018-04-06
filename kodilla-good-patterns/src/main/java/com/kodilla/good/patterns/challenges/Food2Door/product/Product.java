package com.kodilla.good.patterns.challenges.Food2Door.product;

import java.util.Objects;

public class Product {
    private String productName;
    private String measure;
    private double price;

    public Product(String productName, String measure, double price) {
        this.productName = productName;
        this.measure = measure;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getMeasure() {
        return measure;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(measure, product.measure);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productName, measure, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", measure='" + measure + '\'' +
                ", price=" + price +
                '}';
    }
}
