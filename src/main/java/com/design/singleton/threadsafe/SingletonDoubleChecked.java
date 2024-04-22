package com.design.singleton.threadsafe;

public class SingletonDoubleChecked {

    private static SingletonDoubleChecked uniqueInstance;

    private SingletonDoubleChecked() {
    }

    public static SingletonDoubleChecked getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleChecked.class){
                if (uniqueInstance == null){
                    uniqueInstance = new SingletonDoubleChecked();
                }
            }
        }
        return uniqueInstance;
    }
}
