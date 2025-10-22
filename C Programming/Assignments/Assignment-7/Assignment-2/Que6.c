#include<stdio.h>

void division (int *num);

void main ()
{
	int num;
	
	printf("Enter a Number: ");
	scanf("%d",&num);
	
	division (&num);
}

void division (int *num)
{
	if(*num % 3 == 0 && *num % 5 == 0)
		printf("Number is divisible by both 3 and 5.");
		
	else if (*num % 3 == 0)
		printf("Number is divisible by 3.");
		
	else if (*num % 5 == 0)
		printf("Number is divisible by 5.");
	else
		printf("Number is not divisible by 3 as well as 5.");
}