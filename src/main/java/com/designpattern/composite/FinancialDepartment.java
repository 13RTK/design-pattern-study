package com.designpattern.composite;

public class FinancialDepartment implements Department {
    private Integer id;
    private String name;

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
