package com.designpattern.principle.openclosed;

import org.junit.Test;

import java.util.Scanner;

public class Main {
    @Test
    public void calculatorTest() {
        Calculator calculator = new Addition();

        int left;
        int right;

        Scanner scanner = new Scanner(System.in);
        left = scanner.nextInt();
        right = scanner.nextInt();

        int perform = calculator.perform(left, right);
        System.out.println("perform = " + perform);
    }
}
