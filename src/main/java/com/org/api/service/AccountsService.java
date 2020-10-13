package com.org.api.service;

import java.util.List;

import com.org.api.model.dto.ResponseAccountDto;
import com.org.api.model.dto.ResponseAccountTransactionDto;

public interface AccountsService {

	List<ResponseAccountDto> findAccounts();
	List<ResponseAccountTransactionDto> findByUserAccountNumber(long accountNumber);
}
