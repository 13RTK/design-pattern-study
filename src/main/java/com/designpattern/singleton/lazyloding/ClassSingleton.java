package com.designpattern.singleton.lazyloding;

import lombok.Data;

@Data
public class ClassSingleton {
    private static volatile ClassSingleton instance;
    private String info = "Initial info class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if (instance == null) {
            synchronized (ClassSingleton.class) {
                if (instance == null) {
                    instance = new ClassSingleton();
                }
            }
        }
        return instance;
    }
}
