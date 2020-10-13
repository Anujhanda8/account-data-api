package com.org.api.model.dto;

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

import com.org.api.model.Currency;
import com.org.api.model.TransactionType;

@Table
@Entity
@Embeddable
public class ResponseAccountTransactionDto {
	
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
	private String valueDate;
	
	@Column
	@Enumerated(EnumType.STRING)
	@NotNull(message = "currency should not be null")
	private Currency currency;
	
	@Column
	private String creditAmount;
	
	@Column
	private String debitAmount;
	
	@Column
	@Enumerated(EnumType.STRING)
	@NotNull(message = "transactionType should not be null")
	private TransactionType transactionType;
	
	
	public ResponseAccountTransactionDto() {
		super();
	}

	public ResponseAccountTransactionDto(String accountNumber, String accountName, String transactionNarrative, String valueDate,
			Currency currency, String creditAmount, String debitAmount, TransactionType transactionType) {
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
	public String getValueDate() {
		return valueDate;
	}
	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public String getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
}
