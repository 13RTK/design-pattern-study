package com.designpattern.prototype.copy.deepcopy.copyconstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int x;
    private int y;

    public Address(Address that) {
        this(that.getX(), that.getY());
    }
}
