#include<stdio.h>

void pallindrome (int *n1);

void main ()
{
	int num;
	
	printf("Enter a number: ");
	scanf("%d",&num);
	
	pallindrome (&num);
}

void pallindrome (int *n1)
{
	int rev=0,temp,digit;	
	
	temp = *n1;
	
	while (temp !=0 )
	{
		digit = temp % 10;
		rev = rev * 10 + digit;
		temp = temp / 10;
	}
	
	
	if(rev == *n1)
		printf("Number is pallindrome.");
		
	else
		printf("Number is not pallindrome.");
}