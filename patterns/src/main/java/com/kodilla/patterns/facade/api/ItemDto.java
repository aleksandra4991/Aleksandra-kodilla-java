package com.kodilla.patterns.facade.api;

public final class ItemDto {
    private final long productId;
    private final double qty;

    public ItemDto(long productId, double qty) {
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
