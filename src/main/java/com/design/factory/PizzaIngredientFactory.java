package com.design.factory;

import com.design.factory.ingredients.cheese.Cheese;
import com.design.factory.ingredients.clams.Clams;
import com.design.factory.ingredients.dough.Dough;
import com.design.factory.ingredients.pepperoni.Pepperoni;
import com.design.factory.ingredients.sauce.Sauce;
import com.design.factory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
