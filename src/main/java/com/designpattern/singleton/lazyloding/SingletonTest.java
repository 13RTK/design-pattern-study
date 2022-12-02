package com.designpattern.singleton.lazyloding;

import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;

@Log
public class SingletonTest {
    @Test
    public void commonSingletonTest() {
        ClassSingleton instance = ClassSingleton.getInstance();
        ClassSingleton instance1 = ClassSingleton.getInstance();
        instance1.setInfo("New class info");

        Assert.assertEquals(instance.getInfo(), instance1.getInfo());
    }

    @Test
    public void enumSingletonTest() {
        EnumSingleton instance = EnumSingleton.INSTANCE.getInstance();
        System.out.println(instance.getInfo());
        EnumSingleton instance1 = EnumSingleton.INSTANCE.getInstance();
        instance1.setInfo("New class info");

        Assert.assertEquals(instance.getInfo(), instance1.getInfo());
    }

    @Test
    public void multiThreadDoubleCheckedTest1() {

    }
}
