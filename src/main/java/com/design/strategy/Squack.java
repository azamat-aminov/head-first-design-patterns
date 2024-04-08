package com.design.strategy;

public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I squack!");
    }
}
