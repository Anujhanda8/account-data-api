package com.org.api.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.api.model.dto.ResponseAccountDto;
import com.org.api.model.dto.ResponseAccountTransactionDto;
import com.org.api.repository.AccountsRepository;
import com.org.api.transformer.ResponseAccountTransactionTransformer;
import com.org.api.transformer.ResponseAccountTransformer;

@Service
public class AccountsServiceImpl implements AccountsService {

	Logger logger = LoggerFactory.getLogger(AccountsServiceImpl.class);
	private final AccountsRepository accountsRepository;

	@Autowired
	public AccountsServiceImpl(AccountsRepository accountsRepository) {
		this.accountsRepository = accountsRepository;
	}

	// get a list of all accounts
	public List<ResponseAccountDto> findAccounts() {
		List<ResponseAccountDto> responseAccountList = new ArrayList<>();
		logger.debug("accounts fetched from db: "+ accountsRepository.findAll());
		accountsRepository.findAll().forEach(account -> {
			responseAccountList.add(new ResponseAccountTransformer().transformAccountResponse(account));
		});
		return responseAccountList;

	}

	@Override
	public List<ResponseAccountTransactionDto> findByUserAccountNumber(long accountNumber) {
		List<ResponseAccountTransactionDto> responseAccountTransactionList = new ArrayList<>();
		logger.debug("transactions fetched for account: "+accountNumber+" : " + accountsRepository.findAll());
		accountsRepository.findByUserAccountNumber(accountNumber).getAccountTransactionList()
				.forEach(accountTransaction -> {
					responseAccountTransactionList.add(new ResponseAccountTransactionTransformer()
							.transformTransactionResponse(accountTransaction));
				});
		return responseAccountTransactionList;
	}

}
