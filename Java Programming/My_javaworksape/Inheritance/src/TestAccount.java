class Account
{
	int accNo;
	double balance;
	
	Account() 
	{
		this.accNo = 0;
		this.balance = 0;
	}

	Account(int accNo, double balance) 
	{
		//super();
		this.accNo = accNo;
		this.balance = balance;
	}

	int getAccNo() {
		return accNo;
	}

	void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display()
	{
		System.out.println("Account No: "+this.accNo);
		System.out.println("Balance: "+this.balance);
	}
}//class Account ends here

class SavingAccount extends Account
{
	double interestRate;
	
	SavingAccount() 
	{
		super();
		this.interestRate = 0;
	}

	SavingAccount(int accNo, double balance,double interestRate) 
	{
		super(accNo,balance);
		this.interestRate = interestRate;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	void display()
	{
		super.display();
		System.out.println("Interest Rate: "+this.interestRate);
	}
}//class interestRate ends here

class CurrentAccount extends Account
{
	double overdraftLimit;
	
	CurrentAccount() 
	{
		super();
		this.overdraftLimit = 0;
	}

	CurrentAccount(int accNo, double balance,double overdraftLimit) 
	{
		super(accNo,balance);
		this.overdraftLimit = overdraftLimit;
	}

	double getOverdraftLimit() {
		return overdraftLimit;
	}

	void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	void display()
	{
		super.display();
		System.out.println("Limit: "+this.overdraftLimit);
	}
}
class TestAccount {

	public static void main(String[] args) 
	{
		Account a1 = new Account(123045,56984);
		SavingAccount s1 = new SavingAccount(256984,563201,0.7);
		CurrentAccount c1 = new CurrentAccount(789654,236548,20000);
		
		System.out.println("Account Details: ");
		System.out.println();
		a1.display();
		System.out.println();
		
		System.out.println("Saving Account details: ");
		System.out.println();
		s1.display();
		System.out.println();
		
		System.out.println("Current Account details: ");
		System.out.println();
		c1.display();
		System.out.println();
	}

}
