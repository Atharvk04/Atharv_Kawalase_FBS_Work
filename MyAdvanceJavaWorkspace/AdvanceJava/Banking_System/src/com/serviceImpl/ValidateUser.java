package com.serviceImpl;

import java.util.List;

import com.DAOInterface.BankingServices;
import com.aspect.provider.ObjectProvider;
import com.bean.User;
import com.services.AccountServices;

public class ValidateUser implements AccountServices
{
	BankingServices dao = ObjectProvider.createDAOObject();
//	ArrayList<User> list = new ArrayList<User>();
	
	public int openAccount(String accType, float accSal) 
	{
		User user = new User(accType, accSal);
		dao.addAccount(user);
		return user.getAccNo();
	}

	
	public float balEnquiry(int accNo) 
	{
		User a1 = dao.retireveAccountById(accNo);
		
		if(a1 != null) {
			return a1.getAccSal();
		}
		
		return -1;
	}

	
	public float deposit(int accNo, float amount) 
	{
		User a1 = dao.retireveAccountById(accNo);
		
		if(a1 != null)
		{
			a1.setAccSal(a1.getAccSal() + amount);
			System.out.println("Deposit Successfull!!");
			return a1.getAccSal();
		}
		
		System.out.println("Account Not Found!!");
		return 0;
	}

	
	public String printAccountDetails(int accNo) 
	{
		User u = dao.retireveAccountById(accNo);
		
		if(u != null)
		{
			return u.toString();
		}
		
		return "Account not found!! Please Enter Valid Credentials!!";
	}



	public List<User> displayAllAccounts() {
        return dao.getAllAccounts();
    }


	public void withdraw(int accNo, float amount) 
	{
		User a1 = dao.retireveAccountById(accNo);
		
		if(a1 == null)
		{
			System.out.println("Account Not Found!!");
			return;
		}
		
		if(a1.getAccSal() < amount)
		{
			System.out.println("Insufficient Balance!!");
		}
		
		else
		{
			a1.setAccSal(a1.getAccSal() - amount);
			System.out.println("Withdraw Successfull!!");
		}
		
	}
	
	public void transfer(int senderAccNo, int receiverAccNo, double amount) 
	{
		User sender = dao.retireveAccountById(senderAccNo);
		
		User receiver = dao.retireveAccountById(receiverAccNo);
		
	
		if(sender == null)
		{
			System.out.println("Sender Account Not found!!!");
			return;
		}
		
		if(receiver == null)
		{
			System.out.println("Receiver Accunt Not Found!!!");
			return;
		}
		
		if(sender.getAccSal() < amount)
		{
			System.out.println("Insufficient Balance!!!");
			return;
		}
		
		sender.setAccSal(sender.getAccSal() - (float) (amount));
		receiver.setAccSal(receiver.getAccSal() + (float) (amount));
		
		System.out.println("Transaction Successfull");
	
	}
}	
