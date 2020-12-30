package com.retailBanking.accountsService.accountTypeSelectionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.Models.AccountsModel;
import com.retailBanking.accountsService.accountTypeService.AccountTypeSelectionServiceImpl;

@RestController
public class AccountTypeSelectionImpl implements AccountTypeSelection{

	@Autowired
	AccountTypeSelectionServiceImpl service;

	@Override
	@GetMapping(value = "/accountType")
	public List<AccountsModel> getAccountType(@RequestParam(name = "type") String type){

		
		return	service.getAccountType(type);
		

	}

}
