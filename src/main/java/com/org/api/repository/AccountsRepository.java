package com.org.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.api.model.Account;

@Repository
public interface AccountsRepository extends JpaRepository<Account, Long>{

	Account findByUserAccountNumber(long accountNumber);
}
