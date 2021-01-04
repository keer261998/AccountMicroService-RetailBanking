package com.retailBanking.accountsService.AccountRecordController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.retailBanking.accountsService.Models.AccountsModel;
import com.retailBanking.accountsService.Models.Transaction;

public interface AccountRecord {

	

	List<AccountsModel> getAllAccountsListforType(String type);

	List<AccountsModel> getAllAccountDetails(String type, Double id);

	List<AccountsModel> getAccountDetailsByType();

	List<AccountsModel> getAccountDetailsByAccountNo(String accNo);
	
	List<Transaction> getAccountTransactionData( String accNo);

}
