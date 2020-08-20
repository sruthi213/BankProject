package com.cg.service;
import com.cg.exception.MinimumBalanceException;
import com.cg.model.Customer;
import com.cg.model.Account;
public interface BankService {

	public Account createAccount(Customer cusomer, int i) throws MinimumBalanceException;

}
