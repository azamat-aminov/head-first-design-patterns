package com.design.iterator;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public Iterator createIterator() {
        return new NullIterator();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName());
//        if (isVegetarian()) {
//            System.out.println("(v)");
//        }
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("----------------");
    }
}
