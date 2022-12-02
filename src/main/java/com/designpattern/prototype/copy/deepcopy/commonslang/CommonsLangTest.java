package com.designpattern.prototype.copy.deepcopy.commonslang;

import org.apache.commons.lang.SerializationUtils;
import org.junit.Assert;
import org.junit.Test;

public class CommonsLangTest {
    @Test
    public void commonsDeepCopy() {
        Address address = new Address(3, 10);
        User alex = new User("alex", address);

        User clone = (User) SerializationUtils.clone(alex);

        address.setX(10);
        address.setY(3);

        Assert.assertNotEquals(alex.getAddress(), clone.getAddress());
    }
}
