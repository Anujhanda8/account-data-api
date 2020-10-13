package com.org.api.model;

public enum Currency {
	AUD("AUD"), 
	SGD("SGD");
 
    private String currency;
 
    Currency(String currency) {
        this.currency = currency;
    }
 
    public String getCurrency() {
        return currency;
    }
}
