package com.kodilla.patterns.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private ProductService productService;
    private final List<Item>  items = new ArrayList<>();
    private final Long orderId;
    private final Long userId;
    private boolean isPaid = false;
    private boolean isVerfied = false;
    private boolean isSubmitted = false;

    public Order(ProductService productService, Long orderId, Long userId) {
        this.productService = productService;
        this.orderId = orderId;
        this.userId = userId;
    }

    public BigDecimal calculateValue(){
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item : items){
            sum = sum.add(productService.getPrice(item.getProductId()))
                    .multiply(new BigDecimal(item.getQty()));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean isVerfied() {
        return isVerfied;
    }

    public void setVerfied(boolean verfied) {
        isVerfied = verfied;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
