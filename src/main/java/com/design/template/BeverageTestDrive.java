package com.design.template;

public class BeverageTestDrive {

    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();
        System.out.println("Making coffee...");
        coffeeWithHook.prepareRecipe();
        System.out.println("Making tea...");
        teaWithHook.prepareRecipe();
    }
}
