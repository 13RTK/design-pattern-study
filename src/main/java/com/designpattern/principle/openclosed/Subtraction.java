package com.designpattern.principle.openclosed;

public class Subtraction implements Calculator {

    @Override
    public int perform(int left, int right) {
        return left -  right;
    }
}
