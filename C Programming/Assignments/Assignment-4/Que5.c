#include<stdio.h>

void main()
{
	int num;
	
	printf("Enter number: ");
	scanf("%d",&num);
	
	
	while(1)
	{
		int choice = 0;
		printf("\n---------------------------\n");
		printf("\n Enter Choice: \n");
		printf("Press 1 To check number is even or odd.\n");
		printf("Press 2 To check number is prime or not.\n");
		printf("Press 3 To check number is pallindrome or not.\n");
		printf("Press 4 to check number is positive, negative or zero.\n");
		printf("Press 5 To reverse the number.\n");
		printf("Press 6 to find sum of digits.\n");
		printf("Press 7 to Exit.");
		
		printf("Enter your choice: \n");
		scanf("%d",&choice);
		
		if(choice == 1)
		{
			if(num % 2 == 0)
				printf("%d is Even. \n",num);
				
			else
				printf("%d is Odd. \n",num);
		}
		
		else if(choice == 2)
		{
			if(num <= 1)
				printf("%d is not a prime number. \n",num);
			
			else
			{
				int flag = 0;
				for(int i=2; i<= num /2;i++)
				{
					if(num%i == 0)
					{
						flag = 1;
						break;
					}
				}
				if(flag == 0)
					printf("%d Number is prime.\n",num);
				
				else
					printf("%d number is not prime.\n",num);
			}	
		}
	
		else if(choice == 3)
		{
			int temp, rev, rem;
			temp = num;
			rev = 0;
			while(temp != 0)
			{
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp /= 10;
			}
			if(rev == num)
				printf("%d number is pallindrome.\n",num);
			
			else
				printf("%d number is not pallindrome.\n",num);
		}
		else if(choice == 4)
		{
			if(num > 0)
				printf("%d number is positive.\n",num);
			
			else if(num < 0)
				printf("%d number is negative.\n",num);
			
			else
				printf("Number is zero.\n");
		}
		
		else if (choice == 5)
		{
			int temp, rev, rem;
			temp = num;
			rev = 0;
			while(temp != 0)
			{
				rem = temp % 10;
				rev = rev * 10 + rem;
				temp /= 10;
			}
			printf("Reverse of %d number is %d number.\n",num,rev);
		}
		else if(choice == 6)
		{
			int temp = num;
			int sum = 0;
			while (temp != 0)
			{
				int rem = temp % 10;
				sum +=rem;
				temp /= 10;
			}
			printf("Sum of digits of %d is %d.\n",num,sum);
		}
		else if(choice == 7)
		{
			printf("\nExit.\n");
			break;
		}
		else
			printf("\nInvalid choice.");
	}
}
