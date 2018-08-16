package com.bank.dao;
import com.bank.pojo.*;
import java.util.ArrayList;
import java.util.List;

import com.bank.pojo.Customer;

public class BankDAOImpl implements BankDAO{
	
Customer customer=new Customer();
List<Customer> list=new ArrayList<>();
public void add() {
	list.add(new Customer(123,"Rao",456545,"rsa@hd.com","Indian","male",12000));
	list.add(new Customer(124,"Rakesh",452243,"ssa@hd.com","Indian","male",15000));
	list.add(new Customer(125,"Ramesh",455643,"asa@hd.com","Indian","male",30000));
	list.add(new Customer(126,"Rakshith",346543,"vsa@hd.com","Indian","male",20000));
}
public double addWithdrawDetails(double amountWithdrawn) {
	double res=customer.getCurrentBalance()-amountWithdrawn;
	
	return res;
}
@Override
public double deposit(int amount) {
	double res=customer.getCurrentBalance()+amount;
	return res;
}



	

}
