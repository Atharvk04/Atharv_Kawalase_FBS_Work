//2. WAP to initialize some amount in your account. Then give choice to user for deposit or
//	 withdraw. and display updated amount. Condition to withdraw (if the balance is less than
//	 3000 display can't withdraw the amount balance is not sufficient).
//	 ( using function)

#include<stdio.h>

void banking(int ,char);
void main ()
{
	printf("!!!-----WELCOME TO SBI-----!!!\n");
	
	int current;
	printf("\nInitialize some amount in your account: ");
	scanf("%d",&current);
	
	char choice;
	printf("\nTo withdraw money enter 'w'. To deposit money enter 'd': ");
	scanf(" %c",&choice);
	
	banking(current, choice);
}

void banking(int current,char choice)
{
	int withdraw, deposit;
	
	if(choice == 'w' && current<3000)
		printf("\n Can't withdraw. Balance is not sufficient.");
	
	else if(choice == 'w' && current > 3000)
	{
		printf("\n Enter the amount to withdraw: ");
		scanf("%d",&withdraw);
		
		int updatedamount = current - withdraw;
		printf("\nUpdated balance = %drs",updatedamount);
	}
	
	else if (choice == 'd')
	{
		printf("\n Enter the amount to deposit: ");
		scanf("%d",&deposit);
		
		int upd = current + deposit;
		printf("\nUpdated balance: %d rs",upd);
	}
	else
	{
		printf("\nInvalid Choice.\n");
		printf("\n!!!---THANK YOU---!!!\n");
		printf("\n!!!---Visit Again---!!!\n");
	}
}