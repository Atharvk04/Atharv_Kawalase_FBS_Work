package com.DAOImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.DAOInterface.BankingServices;
import com.aspect.provider.ConnectionProvider;
import com.bean.User;

public class BankingServicesImpl implements BankingServices
{

	Connection con = ConnectionProvider.createConnection();
	
	PreparedStatement pst;
	
	ResultSet rs;
	
	Scanner sc = new Scanner(System.in);
	
	public void addAccount(User a1) 
	{
		int rows = 0;
		try
		{
			pst = con.prepareStatement("insert into account (accType, accSal) values (?,?)");
			
//			pst.setInt(1, a1.getAccNo());
			pst.setString(1, a1.getAccType());
			pst.setFloat(2,a1.getAccSal());
			
			int count = pst.executeUpdate();
			
			if(rows > 0)
			{
		        System.out.println("Account Created Successfully!");
		    }
			
			System.out.println("Rows inserted: " + count);
		}
		
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
	}

	
	public User retireveAccountById(int accNo) 
	{
		try
		{
			pst = con.prepareStatement("select * from account where accNo = ?");
			
			pst.setInt(1, accNo);
			
			rs = pst.executeQuery();
			
			if (rs.next()) {
	            User user = new User(
	                rs.getString("accType"),
	                rs.getFloat("accSal")
	            );
	            user.setAccNo(rs.getInt("accNo"));

	            return user;
	        }
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	
	public boolean updateAccountDetails(int accNo) 
	{
		boolean flag = false;
		try
		{
			System.out.println("Enter account Type: ");
			
			String accType = sc.next();
			pst = con.prepareStatement("update account set accType = ? where accNo = ?");
			
			pst.setString(1, accType);
			pst.setInt(1, accNo);
			
			pst.executeUpdate();
			
			flag = true;
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}

	
	public boolean deleteAccountByAccNo(int accNo) 
	{
		boolean flag = false;
		
		try
		{
			pst = con.prepareStatement("delete from account where accNo = ?");
			
			pst.setInt(1, accNo);
			
			int count = pst.executeUpdate();
			
			flag = (count > 0);
			
			System.out.println("Rows deleted: " + count);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;
	}


	
	public List<User> getAllAccounts() {

		List<User> list = new ArrayList<>();

	    try {
	        pst = con.prepareStatement("select * from account");
	        rs = pst.executeQuery();

	        while (rs.next()) {
	            User user = new User(
	                rs.getString("accType"),
	                rs.getFloat("accSal")
	            );
	            user.setAccNo(rs.getInt("accNo"));

	            list.add(user);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return list;
	}



}
