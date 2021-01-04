package com.retailBanking.accountsService.AccountTransactionController;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.Models.Transaction;
import com.retailBanking.accountsService.Repository.TransactionServiceProxy;


@RestController
public class AccountTransactionImpl implements AccountTransaction {
	
	@Autowired
	TransactionServiceProxy service;

	//@GetMapping("account/{account}")
	@Override
	public List<Transaction> getTransactionByAccount(@PathVariable("account") long acc) {
		
		List<Transaction> transaction = service. getTransactionByAccount(acc);
		System.out.println("output"+transaction);
		return transaction;
	}

}
