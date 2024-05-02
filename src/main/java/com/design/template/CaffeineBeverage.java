package com.design.template;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook();
    }

    //    primitive operation
    abstract void brew();

    //    primitive operation
    abstract void addCondiments();


    //    concrete implementation
    void boilWater() {
        System.out.println("Boiling water");
    }

    //    concrete implementation
    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void hook() {
        // do nothing
    }
}
