package com.designpattern.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    @Override
    public double getSpeed() {
        return covertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double covertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
