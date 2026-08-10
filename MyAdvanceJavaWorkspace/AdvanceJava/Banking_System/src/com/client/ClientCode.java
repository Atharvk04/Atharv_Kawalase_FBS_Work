package com.client;

import java.util.List;
import java.util.Scanner;

import com.aspect.provider.ObjectProvider;
import com.bean.User;
import com.services.AccountServices;

public class ClientCode 
{
	public static void main(String[] args) 
	{
		AccountServices service = ObjectProvider.createAccServiceObject();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do
		{
			System.out.println("\n----- MENU -----");
			System.out.println("1. Open Account");
			System.out.println("2. Balance Enquiry");
			System.out.println("3. Deposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Account Details");
			System.out.println("6. Display All Accounts");
			System.out.println("7. Transfer Money");
			System.out.println("8. Exit");

			System.out.print("Enter Your Choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("Enter Account Type: ");
				String type = sc.next();
				
				System.out.print("Enter Initial Balance: ");
				float bal = sc.nextFloat();
				
				int accNo = service.openAccount(type, bal);
				System.out.println("Account Created Successfully!");
				System.out.println("Account Number: " + accNo);
				break;
				
			case 2:
				System.out.print("Enter Account Number: ");
				int acc1 = sc.nextInt();
				
				float balance = service.balEnquiry(acc1);
				
				if(balance != 0)
					System.out.println("Balance: " + balance);
				else
					System.out.println("Account not found!");
				break;
				
			case 3:
				System.out.print("Enter Account Number: ");
				int acc2 = sc.nextInt();
				
				System.out.print("Enter Amount to Deposit: ");
				float amt = sc.nextFloat();
				
				float newBal = service.deposit(acc2, amt);
				
				if(newBal != 0)
					System.out.println("Updated Balance: " + newBal);
				else
					System.out.println("Account not found!");
				break;
				
			case 4:
				System.out.print("Enter Account Number: ");
				int acc4 = sc.nextInt();
				
				System.out.print("Enter Amount to Withdraw: ");
				float wamt = sc.nextFloat();
				
				service.withdraw(acc4, wamt);
				break;
				
			case 5:
				System.out.print("Enter Account Number: ");
				int acc3 = sc.nextInt();
				
				String details = service.printAccountDetails(acc3);
				System.out.println(details);
				break;
				
			case 6:
				List<User> list = service.displayAllAccounts();
				
				if(list.isEmpty()) {
					System.out.println("No accounts found!");
				}
				else {
					for(User u : list) {
						System.out.println(u);
					}
				}
				break;
				
			case 7:
				System.out.print("Enter Sender Account Number: ");
				int sender = sc.nextInt();
				
				System.out.print("Enter Receiver Account Number: ");
				int receiver = sc.nextInt();
				
				System.out.print("Enter Amount: ");
				double amount = sc.nextDouble();
				
				service.transfer(sender, receiver, amount);
				break;
				
			case 8:
				System.out.println("Exiting Application...");
				break;
				
			default:
				System.out.println("Invalid Choice!");
			}
			
		} while(choice != 8);
		
		sc.close();
	}
}