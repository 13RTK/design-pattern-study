package com.desginpattern.builder.decouple;

import org.junit.Test;

public class MainTest {
    @Test
    public void builderTest() {
        BankAccount john = new BankAccount
                .BankAccountBuilder("John", "213141421")
                .withEmail("312312@example.com")
                .withNewsletter(true)
                .build();

        System.out.println(john);
    }
}
