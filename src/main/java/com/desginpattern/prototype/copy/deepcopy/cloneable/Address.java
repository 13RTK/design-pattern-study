package com.desginpattern.prototype.copy.deepcopy.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address implements Cloneable{
    private int x;
    private int y;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Address(this.x, this.y);
        }
    }
}
