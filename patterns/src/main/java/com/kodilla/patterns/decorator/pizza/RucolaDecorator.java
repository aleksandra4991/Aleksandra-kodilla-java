package com.kodilla.patterns.decorator.pizza;

import java.math.BigDecimal;

public class RucolaDecorator extends AbstractPizzaOrderDecorator {

    public RucolaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + rucola";
    }

}
