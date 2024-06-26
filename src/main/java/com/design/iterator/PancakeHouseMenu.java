package com.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu extends Menu {

    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(String name, String description) {
        super(name, description);
        this.menuItems = new ArrayList<>();
        addItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }


    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        int index = 0;
        MenuItem[] result = new MenuItem[menuItems.size()];
        for (MenuItem item : menuItems) {
            result[index] = item;
            index++;
        }
        return new DinerMenuIterator(result);
    }
}
