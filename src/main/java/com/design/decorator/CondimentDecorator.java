package com.design.decorator;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public double cost() {
        return 0;
    }

    public abstract String getDescription();
}
