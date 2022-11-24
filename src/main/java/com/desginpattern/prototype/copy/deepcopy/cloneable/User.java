package com.desginpattern.prototype.copy.deepcopy.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = null;
        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            user = new User(this.name, this.address);
        }

        user.address = (Address) this.address.clone();

        return user;
    }

}
