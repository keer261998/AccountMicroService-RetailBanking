package com.retailBanking.accountsService.accountRecordController;

import java.util.List;

import com.retailBanking.accountsService.Models.AccountsModel;

public interface AccountRecord {

	

	List<AccountsModel> getAllAccountsListforType(String type);

	List<AccountsModel> getAllAccountDetails(String type, Double id);

	List<AccountsModel> getAccountDetailsByType();

	List<AccountsModel> getAccountDetailsByAccountNo(String accNo);

}
