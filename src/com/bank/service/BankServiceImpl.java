package com.bank.service;
import com.bank.dao.*;
public class BankServiceImpl implements BankService{

	BankDAO dao = new BankDAOImpl();
	@Override
	public double addWithdrawDetails( double amountWithdrawn) {
		
		return dao.addWithdrawDetails(  amountWithdrawn);
		
	}
	@Override
	public double deposit(int amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}

}
