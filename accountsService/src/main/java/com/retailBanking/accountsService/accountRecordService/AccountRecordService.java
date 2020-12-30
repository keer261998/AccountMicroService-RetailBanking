package com.retailBanking.accountsService.accountRecordService;

import java.math.BigInteger;
import java.util.List;

import com.retailBanking.accountsService.Models.AccountsModel;
import com.retailBanking.accountsService.Models.CreditCardModel;

public interface AccountRecordService {

	 List<AccountsModel> getAllAccountsListforType(String type, Double userId);

	

	List<AccountsModel> fetchAllAccountsByDefault(String type, Double id);



	List<AccountsModel> fetchAllAccountByViewMore(String type, Double id);



	List<AccountsModel> getAccountDetailsByAccountNo(BigInteger accountNo);



	List<CreditCardModel> getCreditCardDetatils(BigInteger accountNo) throws Exception;
	
}
