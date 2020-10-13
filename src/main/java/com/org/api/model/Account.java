package com.org.api.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table
@Entity
public class Account {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	
	@Column
	@NotNull(message = "userAccountNumber should not be null")
	private long userAccountNumber;
	
	@ElementCollection
	private Set<AccountTransaction> accountTransactionList = new HashSet<AccountTransaction>();

	@Column
	@NotNull(message = "accountName should not be null")
	private String accountName;
	
	@Column
	@Enumerated(EnumType.STRING)
	@NotNull(message = "accountType should not be null")
	private AccountType accountType;
	
	@Column
	private LocalDate balanceDate;
	
	@Column
	@Enumerated(EnumType.STRING)
	@NotNull(message = "currency should not be null")
	private Currency currency;
	
	@Column
	private float openingAvailableBalance;
	
	
	public Account() {
		super();
	}

		public Account(long userAccountNumber, String accountName, AccountType accountType, LocalDate balanceDate, Currency currency,
				float openingAvailableBalance) {
		super();
		this.userAccountNumber = userAccountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.openingAvailableBalance = openingAvailableBalance;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	public LocalDate getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(LocalDate balanceDate) {
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

	public Set<AccountTransaction> getAccountTransactionList() {
		return accountTransactionList;
	}

	public void setAccountTransactionList(Set<AccountTransaction> accountTransactionList) {
		this.accountTransactionList = accountTransactionList;
	}
}
