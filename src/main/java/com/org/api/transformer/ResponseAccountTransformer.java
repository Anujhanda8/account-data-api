package com.org.api.transformer;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import com.org.api.model.Account;
import com.org.api.model.dto.ResponseAccountDto;

public class ResponseAccountTransformer {

	public ResponseAccountDto transformAccountResponse(Account account) {
		return new ResponseAccountDto(
				account.getUserAccountNumber(),
				account.getAccountName(),
				account.getAccountType(), 
				account.getBalanceDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)),
				account.getCurrency(),
				account.getOpeningAvailableBalance()); 
	}
}
