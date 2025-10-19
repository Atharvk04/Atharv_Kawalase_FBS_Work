#include<stdio.h>

int pallindrome(int num1);

void main ()
{
	int a, result;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	result = pallindrome (a);
	
	if(result == 0)
		printf("Number is Pallindrome");
		
	else
		printf("Number is not Pallindrome");
}

int pallindrome(int num1)
{
	int rev=0,temp,digit;	
	
	temp = num1;
	
	while (temp !=0 )
	{
		digit = temp % 10;
		rev = rev * 10 + digit;
		temp = temp / 10;
	}
	
	
	if(rev == num1)
		return 0;
		
	else
		return 1;
}