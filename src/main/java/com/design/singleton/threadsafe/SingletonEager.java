package com.design.singleton.threadsafe;

public class SingletonEager {

    private static SingletonEager uniqueInstance = new SingletonEager();

    private SingletonEager() {
    }

    public SingletonEager getInstance() {
        return uniqueInstance;
    }
}
