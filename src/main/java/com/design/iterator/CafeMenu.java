package com.design.iterator;

import com.design.iterator.Menu;
import com.design.iterator.MenuItem;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu extends Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu(String name, String description) {
        super(name, description);
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }


    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

//    public Hashtable getMenuItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
