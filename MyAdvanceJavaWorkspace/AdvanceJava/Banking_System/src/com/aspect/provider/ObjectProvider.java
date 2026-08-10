package com.aspect.provider;

import java.io.FileInputStream;
import java.util.Properties;
import com.DAOInterface.BankingServices;
import com.services.AccountServices;

public class ObjectProvider 
{
	static Properties p = new Properties();

	static 
	{
		
		try 
		{
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			p.load(fis);
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	
	public static AccountServices createAccServiceObject()
	{
		
		AccountServices a = null;
		
		try
		{
			String className = p.getProperty("BusinessClass");
			
			a = (AccountServices) Class.forName(className).newInstance();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return a;
		
	}
	
	public static BankingServices createDAOObject()
	{
		BankingServices b = null;
		
		try
		{
			String className = p.getProperty("DAOClass");

			b = (BankingServices) Class.forName(className).newInstance();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return b;
	}
	
}
