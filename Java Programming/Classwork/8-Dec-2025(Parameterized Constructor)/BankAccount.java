class BankAccount 
{
	double accNo, currentBalance, interestRate;
	String holderName;
	
	BankAccount()
	{
		this.accNo = 7896523;
		this.holderName = "Akshay";
		this.currentBalance = 45896;
		this.interestRate = 0.12;
	
		System.out.println("default constructor get call"+"\n");
	}
	
	BankAccount(double aNo, double balance, double rate, String name)
	{
		this.accNo = aNo;
		this.currentBalance = balance;
		this.interestRate = rate;
		this.holderName = name;
	
		System.out.println("\n"+"parameterized constructor get call");
	}
	
	void setAccNo(double b)
	{
		this.accNo = b;
	}
	
	void setCurrentBalance(double b)
	{
		this.currentBalance = b;
	}
	
	void setInterestRate (double b)
	{
		this.interestRate = b;
	}
	
	void setHolderName(String b)
	{
		this.holderName = b;
	}
	
	double getAccNo()
	{
		return this.accNo;	
	}
	
	double getCurrentBalance()
	{
		return this.currentBalance;
	}
	
	double getInterestRate()
	{	
		return this.interestRate;
	}
	
	String getHolderName()
	{
		return this.holderName;
	}	
	
}// BankAccount class ends here

class TestBankAccount
{
	public static void main (String [] args)
	{
		BankAccount B1;
		
		B1 = new BankAccount ();

		B1.setAccNo (7895623);
		B1.setHolderName ("Akshay");
		B1.setCurrentBalance (569874);
		B1.setInterestRate  (0.15);
		
		System.out.println("Account no: "+B1.getAccNo());
		System.out.println("Current Balance: "+B1.getCurrentBalance());
		System.out.println("Interest Rate: "+B1.getInterestRate());
		System.out.println("Holder Name: "+B1.getHolderName());
	
		BankAccount B2 = new BankAccount (785631,485693,0.17,"Mihir");
	}
}//TestBankAccount class ends here