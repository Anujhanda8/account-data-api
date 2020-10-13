package com.org.api.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
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
@Embeddable
public class AccountTransaction {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	@NotNull(message = "accountNumber should not be null")
	private String accountNumber;
	
	@Column
	private String accountName;
	
	@Column
	private String transactionNarrative;
	
	@Column
	private LocalDate valueDate;
	
	@Column
	@Enumerated(EnumType.STRING)
	@NotNull(message = "currency should not be null")
	private Currency currency;
	
	@Column
	private Double creditAmount;
	
	@Column
	private Double debitAmount;
	
	@Column
	@Enumerated(EnumType.STRING)
	@NotNull(message = "transactionType should not be null")
	private TransactionType transactionType;
	
	
	public AccountTransaction() {
		super();
	}

	public AccountTransaction(String accountNumber, String accountName, String transactionNarrative, LocalDate valueDate,
			Currency currency, Double creditAmount, Double debitAmount, TransactionType transactionType) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.transactionNarrative = transactionNarrative;
		this.valueDate = valueDate;
		this.currency = currency;
		this.creditAmount = creditAmount;
		this.debitAmount = debitAmount;
		this.transactionType = transactionType;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getTransactionNarrative() {
		return transactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	public LocalDate getValueDate() {
		return valueDate;
	}
	public void setValueDate(LocalDate valueDate) {
		this.valueDate = valueDate;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public Double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(Double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
}
