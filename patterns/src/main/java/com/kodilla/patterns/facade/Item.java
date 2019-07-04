package com.kodilla.patterns.facade;

public class Item {
    private final long productId;
    private final double qty;

    public Item(long productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

    public long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
