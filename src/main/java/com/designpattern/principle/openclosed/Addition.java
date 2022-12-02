package com.designpattern.principle.openclosed;

public class Addition implements Calculator{

    @Override
    public int perform(int left, int right) {
        return left + right;
    }
}
