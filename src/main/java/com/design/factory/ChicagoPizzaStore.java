package com.design.factory;

import com.design.factory.pizzafactory.CheesePizza;
import com.design.factory.pizzafactory.ClamPizza;
import com.design.factory.pizzafactory.PepperoniPizza;
import com.design.factory.pizzafactory.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
//        TODO create Chicago Ingredient Factory
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            default:
                throw new IllegalArgumentException();
        }
        return pizza;
    }
}
