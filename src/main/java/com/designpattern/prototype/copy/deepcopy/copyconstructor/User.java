package com.designpattern.prototype.copy.deepcopy.copyconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Address address;
    private int age;

    public User(User that) {
        this(that.getName(), new Address(that.getAddress()), that.getAge());
    }
}
