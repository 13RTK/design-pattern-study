package com.designpattern.prototype.copy.shadowcopy;

import org.junit.Assert;
import org.junit.Test;

public class ShadowCopyTest {
    @Test
    public void shadowCopyTest() {
        Address address = new Address(1, 2);

        User user1 = new User("alex", 22, address);
        User clone = user1.clone();

        address.setX(2);
        address.setY(3);

        System.out.println(user1);
        System.out.println(clone);

        Assert.assertNotSame(user1, clone);
        Assert.assertNotEquals(user1.getAddress(), clone.getAddress());
    }
}
