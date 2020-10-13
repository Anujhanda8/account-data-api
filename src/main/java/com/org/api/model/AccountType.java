package com.org.api.model;

public enum AccountType {
	Savings("Savings"), 
    Current("Current");
 
    private String accountType;
 
    AccountType(String accountType) {
        this.accountType = accountType;
    }
 
    public String getAccountType() {
        return accountType;
    }
}
