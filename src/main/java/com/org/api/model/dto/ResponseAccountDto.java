package com.org.api.model.dto;

import com.org.api.model.AccountType;
import com.org.api.model.Currency;

public class ResponseAccountDto {
	
	private long userAccountNumber;
	
	private String accountName;
	
	private AccountType accountType;
	
	private String balanceDate;
	
	private Currency currency;
	
	private float openingAvailableBalance;
	
	
	public ResponseAccountDto() {
		super();
	}

	public ResponseAccountDto(long userAccountNumber, String accountName, AccountType accountType, String balanceDate, Currency currency,
			float openingAvailableBalance) {
		super();
		this.userAccountNumber = userAccountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openingAvailableBalance = openingAvailableBalance;
	}
	
	public long getUserAccountNumber() {
		return userAccountNumber;
	}
	public void setUserAccountNumber(long userAccountNumber) {
		this.userAccountNumber = userAccountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public String getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public float getOpeningAvailableBalance() {
		return openingAvailableBalance;
	}
	public void setOpeningAvailableBalance(float openingAvailableBalance) {
		this.openingAvailableBalance = openingAvailableBalance;
	}
}
