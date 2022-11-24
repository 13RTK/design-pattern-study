package com.desginpattern.prototype.copy.shadowcopy;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Cloneable {
    private String name;
    private int age;

    private Address address;

    @Override
    public User clone() {
        User newUser = new User();
        newUser.setName(this.getName());
        newUser.setAge(this.getAge());
        newUser.setAddress(this.getAddress());

        return newUser;
    }
}
