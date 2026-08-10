package com.services;

import java.util.List;

import com.bean.User;

public interface AccountServices 
{
	public int openAccount(String accType, float accSal);
	
	public float balEnquiry(int accNo);
	
	public float deposit(int accNo, float amount);
	
	public String printAccountDetails(int accNo);
	
	List<User> displayAllAccounts();
	
	public void withdraw(int accNo, float amount);
	
	public void transfer(int senderAccNo, int receiverAccNo, double amount);
	
}
