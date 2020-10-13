package com.org.api.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import com.org.api.model.Account;
import com.org.api.model.AccountType;
import com.org.api.model.Currency;
import com.org.api.service.AccountsService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AccountsController.class)
public class AccountsControllerTest {
	
	@Autowired
	  private MockMvc mockMvc;

	  @MockBean
	  private AccountsService accountsService;
	  
	  private Account obj1 = new Account(1l, "acName1", AccountType.Current, LocalDate.now(), Currency.AUD, 123.4f); 
		private Account obj2 = new Account(2l, "acName2", AccountType.Savings, LocalDate.now(), Currency.SGD, 456.4f); 
		private List<Account> accountList = new ArrayList<>();
	
	  @Test
    public void testAccountsController() throws Exception {
		  
		  accountList.add(obj1);
			accountList.add(obj2);
			RequestBuilder request = MockMvcRequestBuilders.get("/accounts");
			doReturn(accountList).when(accountsService).findAccounts();
			MvcResult rs = mockMvc.perform(request).andReturn();
			System.out.println(rs.getResponse().getStatus());
			assertEquals(rs.getResponse().getStatus(), 200);
	  }
}
