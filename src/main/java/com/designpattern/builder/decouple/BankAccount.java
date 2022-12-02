package com.designpattern.builder.decouple;

import lombok.Data;

@Data
public class BankAccount {
    private String name;
    private String accountName;
    private String email;
    private boolean newsletter;

    public BankAccount(BankAccountBuilder builder) {
        this.name = builder.name;
        this.accountName = builder.accountNumber;
        this.email = builder.email;
        this.newsletter = builder.newsletter;
    }

    static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder withNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
