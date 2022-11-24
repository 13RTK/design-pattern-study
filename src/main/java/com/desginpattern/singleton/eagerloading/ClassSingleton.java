package com.desginpattern.singleton.eagerloading;

public class ClassSingleton {
    private ClassSingleton instance = new ClassSingleton();

    private ClassSingleton() {
    }

    public ClassSingleton getInstance() {
        return instance;
    }
}
