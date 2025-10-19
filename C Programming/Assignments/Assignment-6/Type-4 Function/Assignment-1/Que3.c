#include<stdio.h>

int leap(int num1);

void main ()
{
	int year, result;
	
	printf("Enter a year: ");
	scanf("%d",&year);
	
	result = leap (year);
	
	if(result == 0)
		printf("Year is leap.");
	
	else
		printf("Year is not leap.");
}

int leap(int num1)
{
	if (num1 % 4 == 0 && num1 % 100 != 0 || num1 /400 == 0)
		return 0;
		
	else
		return 1;
}