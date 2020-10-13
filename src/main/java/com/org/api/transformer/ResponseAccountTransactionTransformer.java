package com.org.api.transformer;

import java.time.format.DateTimeFormatter;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.org.api.model.AccountTransaction;
import com.org.api.model.dto.ResponseAccountTransactionDto;

public class ResponseAccountTransactionTransformer {

	public ResponseAccountTransactionDto transformTransactionResponse(AccountTransaction accountTransaction) {

		System.out.println("----"+ accountTransaction.getTransactionNarrative());
		System.out.println("===="+ StringUtils.defaultString(accountTransaction.getTransactionNarrative()));
		return new ResponseAccountTransactionDto(
				accountTransaction.getAccountNumber(),
				accountTransaction.getAccountName(),
				StringUtils.defaultString(accountTransaction.getTransactionNarrative()),
				accountTransaction.getValueDate().format(DateTimeFormatter.ofPattern("MMM dd, yyyy")),
				accountTransaction.getCurrency(),
				Objects.toString(accountTransaction.getCreditAmount(), ""),
				Objects.toString(accountTransaction.getDebitAmount(), ""),
				accountTransaction.getTransactionType()); 
	}
}
