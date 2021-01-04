package com.retailBanking.accountsService.Repository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.retailBanking.accountsService.Models.AccountsModel;
import com.retailBanking.accountsService.Models.Transaction;
//import com.retailBanking.accountsService.Models.TransactionMicroServiceModel;

@FeignClient(name="transaction-service")
@RibbonClient(name="transaction-service")
@Component
public interface TransactionServiceProxy {
	
	//List<TransactionMicroServiceModel> getTransactionByAccount(BigInteger accNo);
	/*@GetMapping(value="/getfive/{account}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<Transaction> getLastFive(@PathVariable("account") BigInteger account);
	*/
	
	@GetMapping(value="account/{accountNo}",produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Transaction> getTransactionByAccount(@PathVariable("accountNo") long dec);

}
