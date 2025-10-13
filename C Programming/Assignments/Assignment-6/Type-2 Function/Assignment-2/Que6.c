#include<stdio.h>

int division ();

void main ()
{
	int result;
	
	result = division ();
	
	if (result == 0)
		printf("Number is Divided by Both 3 and 5");
	else if(result == 1)
		printf("Number is divide by 3");
	else if(result == 2)
		printf("Number is divided by 5");
	else
		printf("Number is not Divisible by both 3 and 5");
}

int division ()
{
	int num;
	
	printf("Enter a Number: ");
	scanf("%d",&num);
	
	if(num % 3 == 0 && num % 5 == 0)
		return 0;
	else if (num % 3 == 0)
		return 1;
	else if (num % 5 == 0)
		return 2;
	else
		return 3;
}