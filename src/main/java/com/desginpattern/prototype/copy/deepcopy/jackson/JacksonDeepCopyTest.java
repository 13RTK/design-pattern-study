package com.desginpattern.prototype.copy.deepcopy.jackson;

import com.desginpattern.prototype.copy.deepcopy.gson.Address;
import com.desginpattern.prototype.copy.deepcopy.gson.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;

@Log
public class JacksonDeepCopyTest {
    @Test
    public void jacksonDeepCopyTest() throws JsonProcessingException {
        Address address = new Address(5, 9);
        User user = new User("alex", address);

        ObjectMapper mapper = new ObjectMapper();
        User clone = mapper.readValue(mapper.writeValueAsString(user), User.class);

        address.setX(9);
        address.setY(5);

        Assert.assertNotEquals(user.getAddress(), clone.getAddress());
    }
}
