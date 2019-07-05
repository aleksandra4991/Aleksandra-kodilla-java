package com.kodilla.patterns.decorator.pizza;

import java.math.BigDecimal;

public class DrinkDecorator extends AbstractPizzaOrderDecorator  {

    public DrinkDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(8));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " 1 liter drink";
    }
}
