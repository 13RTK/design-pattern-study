package com.desginpattern.singleton.lazyloding;

public class MisDoubleCheckedSingleton {
    private static MisDoubleCheckedSingleton instance;

    private MisDoubleCheckedSingleton() {
    }

    public static MisDoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (ClassSingleton.class) {
                if (instance == null) {
                    instance = new MisDoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}
