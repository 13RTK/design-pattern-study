package com.desginpattern.prototype.copy.deepcopy.gson;

import com.google.gson.Gson;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;

@Log
public class GsonDeepCopyTest {
    @Test
    public void GsonDeepCopyTest() {
        Address address = new Address(3, 8);
        User user = new User("alex", address);

        Gson gson = new Gson();
        User clone = gson.fromJson(gson.toJson(user), User.class);
        address.setX(9);
        address.setY(9);

        log.info(gson.toJson(user));
        log.info(gson.toJson(clone));

        Assert.assertNotEquals(user.getAddress(), clone.getAddress());
    }
}
