package com.design.factory;

import com.design.factory.pizzafactory.CheesePizza;
import com.design.factory.pizzafactory.ClamPizza;
import com.design.factory.pizzafactory.PepperoniPizza;
import com.design.factory.pizzafactory.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return pizza;
    }
}
