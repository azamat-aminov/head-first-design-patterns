package com.design.factory;

import com.design.factory.ingredients.cheese.Cheese;
import com.design.factory.ingredients.clams.Clams;
import com.design.factory.ingredients.dough.Dough;
import com.design.factory.ingredients.pepperoni.Pepperoni;
import com.design.factory.ingredients.sauce.Sauce;
import com.design.factory.ingredients.veggies.Veggies;

import java.util.Arrays;

public abstract class Pizza {

    public String name;
    public Dough dough;
    public Sauce sauce;

    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    public abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
