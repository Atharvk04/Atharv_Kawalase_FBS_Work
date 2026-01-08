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
	
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + "]";
	}

	double calBalance()
	{
		return balance;
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
	
	
	public String toString() {
		return super.toString() + "SavingAccount [interestRate=" + interestRate + "]";
	}

	double calBalance()
	{
		return balance + (balance * interestRate);
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
	
	public String toString() {
		return super.toString() + "CurrentAccount [overdraftLimit=" + overdraftLimit + "]";
	}

	double calBalance()
	{
		return balance + overdraftLimit;
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
		System.out.println(a1.toString());
		System.out.println();
		
		System.out.println("Saving Account details: ");
		System.out.println();
		System.out.println(s1.toString());
		System.out.println();
		
		System.out.println("Current Account details: ");
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
	}

}

class MyTestAccount
{
	public static void main(String[] args)
	{
		Account a;

		a = new Account(111111, 50000);
		a.calBalance();
		System.out.println("Calculated Balance: " + a.calBalance());

		a = new SavingAccount(222222, 100000, 0.05);
		a.calBalance();
		System.out.println("Calculated Balance: " + a.calBalance());

		a = new CurrentAccount(333333, 75000, 15000);
		a.calBalance();
		System.out.println("Calculated Balance: " + a.calBalance());
	}
}
