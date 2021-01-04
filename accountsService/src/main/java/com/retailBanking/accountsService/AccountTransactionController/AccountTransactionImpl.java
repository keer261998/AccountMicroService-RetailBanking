package com.retailBanking.accountsService.AccountTransactionController;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.retailBanking.accountsService.Models.TransactionMicroServiceModel;
import com.retailBanking.accountsService.TransactionService.TransactionService;

@Controller
public class AccountTransactionImpl implements AccountTransaction {
	@Autowired
	TransactionService service;

	@Override
	public List<TransactionMicroServiceModel> getTransactionByAccount(BigInteger accNo) {
		List<TransactionMicroServiceModel> transaction = service.getTransactionByAccount(accNo);
		return transaction;
	}

}
