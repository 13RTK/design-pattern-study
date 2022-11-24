package com.desginpattern.prototype.copy.deepcopy.cloneable;

import org.junit.Assert;
import org.junit.Test;

public class CloneableTest {
    @Test
    public void cloneableTest() throws CloneNotSupportedException {
        Address address = new Address(1, 2);
        User user = new User("alex", address);

        User clone = (User) user.clone();
        address.setX(2);
        address.setY(9);

        System.out.println(user);
        System.out.println(clone);

        Assert.assertNotEquals(user.getAddress(), clone.getAddress());
    }
}
