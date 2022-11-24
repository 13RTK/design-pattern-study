package com.desginpattern.prototype.copy.deepcopy.copyconstructor;

import org.junit.Assert;
import org.junit.Test;

public class DeepCopyTest {
    @Test
    public void deepCopyTest() {
        Address address = new Address(1, 2);
        User user = new User("alex", address, 22);

        User clone = new User(user);
        address.setX(2);
        address.setY(9);

        System.out.println(user);
        System.out.println(clone);

        Assert.assertNotEquals(user.getAddress(), clone.getAddress());
    }
}
