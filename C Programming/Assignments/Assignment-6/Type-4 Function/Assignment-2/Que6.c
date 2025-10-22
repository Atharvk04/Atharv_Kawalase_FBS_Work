#include<stdio.h>

int division (int num);

void main ()
{
	int a, result;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	result = division (a);
	
	if(result == 0)
		printf("Number is divisible by both 3 and 5.");
		
	else if (result == 1)
		printf("Number is divisible by 3.");
		
	else if (result == 2)
		printf("Number is divisible by 5.");
		
	else 
		printf("Number is not divisible by 3 and 5.");
}

int division (int num)
{
	if(num % 3 == 0 && num % 5 == 0)
		return 0;
		
	else if (num % 3 == 0)
		return 1;
		
	else if (num % 5 == 0)
		return 2;
		
	else
		return 3;
}