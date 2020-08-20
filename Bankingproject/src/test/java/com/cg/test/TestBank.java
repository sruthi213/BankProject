package com.cg.test;
import org.junit.Test;

import com.cg.exception.MinimumBalanceException;
import com.cg.model.Address;
import com.cg.model.Customer;
import com.cg.service.BankService;
import com.cg.service.BankServiceImpl;
public class TestBank {
	public BankService bank;
	
	public TestBank()
	{
		bank = new BankServiceImpl();
	}
	
	@Test(expected=MinimumBalanceException.class)
	public void checkAccountCreation()throws MinimumBalanceException {
		// TODO Auto-generated method stub
		Customer cusomer=new Customer();
		cusomer.setCustID(1001);
		cusomer.setCustName("Sruthi");
		cusomer.setAddress(new Address("Tirupur","Tamilnadu"));
		bank.createAccount(cusomer,500);

	}

}
