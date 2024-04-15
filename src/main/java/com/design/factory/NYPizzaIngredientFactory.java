package com.design.factory;

import com.design.factory.ingredients.cheese.Cheese;
import com.design.factory.ingredients.cheese.ReggianoCheese;
import com.design.factory.ingredients.clams.Clams;
import com.design.factory.ingredients.clams.FreshClams;
import com.design.factory.ingredients.dough.Dough;
import com.design.factory.ingredients.dough.ThinCrustDough;
import com.design.factory.ingredients.pepperoni.Pepperoni;
import com.design.factory.ingredients.pepperoni.SlicedPepperoni;
import com.design.factory.ingredients.sauce.MarinaraSauce;
import com.design.factory.ingredients.sauce.Sauce;
import com.design.factory.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
