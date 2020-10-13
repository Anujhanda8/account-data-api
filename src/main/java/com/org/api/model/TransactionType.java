package com.org.api.model;

public enum TransactionType {
	Debit("Debit"), 
    Credit("Credit");
 
    private String transactionType;
 
    TransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
 
    public String gettransactionType() {
        return transactionType;
    }
}
