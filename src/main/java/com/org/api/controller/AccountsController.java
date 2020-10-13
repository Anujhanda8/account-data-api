package com.org.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.api.model.dto.ResponseAccountDto;
import com.org.api.model.dto.ResponseAccountTransactionDto;
import com.org.api.service.AccountsService;

@RestController
@RequestMapping("/")
public class AccountsController {

	Logger logger = LoggerFactory.getLogger(AccountsController.class);
	private final AccountsService accountsService;

	@Autowired
	public AccountsController(AccountsService accountsService) {
		this.accountsService = accountsService;
	}

	// GET Accounts
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("accounts")
	public ResponseEntity<List<ResponseAccountDto>> getAccounts() {
		List<ResponseAccountDto> accountsList = accountsService.findAccounts();
		logger.info("accounts fetched");
		return new ResponseEntity<List<ResponseAccountDto>>(accountsList,HttpStatus.OK);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("accounts/transactions/{accountNumber}")
	public ResponseEntity<List<ResponseAccountTransactionDto>>getAccountTransactions(
			@PathVariable("accountNumber") long accountNumber) {
		List<ResponseAccountTransactionDto> accountTransactionsList = accountsService.findByUserAccountNumber(accountNumber);
		logger.info("account transactions fetched");
		return new ResponseEntity<List<ResponseAccountTransactionDto>>(accountTransactionsList,HttpStatus.OK);
	}
}
