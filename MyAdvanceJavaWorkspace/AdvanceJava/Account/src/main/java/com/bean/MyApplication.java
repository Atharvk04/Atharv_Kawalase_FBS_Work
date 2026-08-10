package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Account;
import com.bean.SavingAcc;
import com.bean.LoanAcc;

public class MyApplication 
{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session s;
    Transaction t;
    
    public static void main(String[] args) 
    {
    	MyApplication app = new MyApplication();

        app.saveData();
        app.retriveData();
        app.updateData();
        app.deleteData();
        
	}
    
    public void saveData()
    {
        try
        {
            s = factory.openSession();
            t = s.beginTransaction();

            s.save(new Account(25698, 596320,new MyDate(14,8,2021)));
            s.save(new SavingAcc(25412, 256984, new MyDate(15,8,2022),6.7f));
            s.save(new LoanAcc(14589, 569745, new MyDate(12,11,2022),14,99932.0f));
            t.commit();
            System.out.println("Data inserted successfully!");
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
            t.rollback();
        }
    }

    public void retriveData()
    {
    	try
    	{
    		s = factory.openSession();
    		
    		Account A1 = s.get(Account.class,25698);
    		
    		if(A1 != null)
                System.out.println("Account balance: " + A1.getAccbal());
            else
                System.out.println("Invalid Account Number!!");
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public void updateData()
    {
    	try
    	{
    		 s = factory.openSession();
    		 t = s.beginTransaction();
    		 
    		 Account A1 = s.get(Account.class,25698);
     		
     		if(A1 != null)
     		{
     			A1.setAccbal(698456);
     			t.commit();
     			
     			System.out.println("Updated Account Balance: " + A1.getAccbal());
     		}
     		
     		else
     			System.out.println("Account not found for Update!!");
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public void deleteData()
    {
    	try
    	{
    		 s = factory.openSession();
             t = s.beginTransaction();
             
             Account A1 = s.get(Account.class,25698);
             
             if(A1 != null)
             {
            	 s.delete(A1);
            	 t.commit();
            	 
            	 System.out.println("Account deleted Successfully!!!");
             }
             
             else
            	 System.out.println("Account not found for deletion!!!");
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
}
