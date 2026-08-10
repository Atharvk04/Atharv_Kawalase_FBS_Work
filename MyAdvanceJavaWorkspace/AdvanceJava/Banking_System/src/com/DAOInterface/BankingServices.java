package com.DAOInterface;


import java.util.List;

import com.bean.User;

public interface BankingServices 
{
	public void addAccount(User a1);
	
	public User retireveAccountById(int accNo);
	
	public boolean updateAccountDetails(int accNo);
	
	public boolean deleteAccountByAccNo(int accNo);

	public List<User> getAllAccounts();
	
	
}
