package com.design.singleton.threadsafe;

public class SingletonThreadSafe {

    public static SingletonThreadSafe uniqueInstance;

    private SingletonThreadSafe() {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonThreadSafe();
        }
        return uniqueInstance;
    }
}
