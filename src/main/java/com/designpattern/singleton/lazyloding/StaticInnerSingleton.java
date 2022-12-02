package com.designpattern.singleton.lazyloding;

public class StaticInnerSingleton {

    static class InnerInstance {
        static StaticInnerSingleton singletonInstance = new StaticInnerSingleton();
    }

    private StaticInnerSingleton() {

    }

    public static StaticInnerSingleton getInstance() {
        return InnerInstance.singletonInstance;
    }
}
