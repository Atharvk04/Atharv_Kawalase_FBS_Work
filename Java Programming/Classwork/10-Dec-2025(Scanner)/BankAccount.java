import java.util.Scanner;

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

        System.out.println("default constructor get call" + "\n");
    }

    BankAccount(double aNo, double balance, double rate, String name)
    {
        this.accNo = aNo;
        this.currentBalance = balance;
        this.interestRate = rate;
        this.holderName = name;

        System.out.println("\nparameterized constructor get call");
    }

    void setAccNo(double aNo) { this.accNo = aNo; }
    void setCurrentBalance(double balance) { this.currentBalance = balance; }
    void setInterestRate(double rate) { this.interestRate = rate; }
    void setHolderName(String name) { this.holderName = name; }

    double getAccNo() { return this.accNo; }
    double getCurrentBalance() { return this.currentBalance; }
    double getInterestRate() { return this.interestRate; }
    String getHolderName() { return this.holderName; }
}

class TestBankAccount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        BankAccount B1 = new BankAccount();
        B1.setAccNo(7895623);
        B1.setHolderName("Akshay");
        B1.setCurrentBalance(569874);
        B1.setInterestRate(0.15);

        System.out.println("Account no: " + B1.getAccNo());
        System.out.println("Current Balance: " + B1.getCurrentBalance());
        System.out.println("Interest Rate: " + B1.getInterestRate());
        System.out.println("Holder Name: " + B1.getHolderName());

        BankAccount B2 = new BankAccount(785631, 485693, 0.17, "Mihir");

        System.out.println("Account no: " + B2.getAccNo());
        System.out.println("Current Balance: " + B2.getCurrentBalance());
        System.out.println("Interest Rate: " + B2.getInterestRate());
        System.out.println("Holder Name: " + B2.getHolderName());

        BankAccount B3 = new BankAccount();
        System.out.println("\nEnter details for 3rd BankAccount:");

        System.out.print("Enter Account No: ");
        B3.setAccNo(sc.nextDouble());
        sc.nextLine();

        System.out.print("Enter Holder Name: ");
        B3.setHolderName(sc.nextLine());

        System.out.print("Enter Current Balance: ");
        B3.setCurrentBalance(sc.nextDouble());

        System.out.print("Enter Interest Rate: ");
        B3.setInterestRate(sc.nextDouble());

        System.out.println("\nAccount no: " + B3.getAccNo());
        System.out.println("Current Balance: " + B3.getCurrentBalance());
        System.out.println("Interest Rate: " + B3.getInterestRate());
        System.out.println("Holder Name: " + B3.getHolderName());

        sc.close();
    }
}
