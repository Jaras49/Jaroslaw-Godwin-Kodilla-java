package com.kodilla.stream.invoice.simple;

public final class SimpleItem {

    private final SimpleProduct product;
    private final double quantity;

    public SimpleItem(SimpleProduct simpleProduct, double quantity) {
        this.product = simpleProduct;
        this.quantity = quantity;
    }

    public SimpleProduct getSimpleProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue(){
        return product.getProductPrice() * quantity;
    }
}
