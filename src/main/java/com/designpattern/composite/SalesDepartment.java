package com.designpattern.composite;

public class SalesDepartment implements Department {
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
