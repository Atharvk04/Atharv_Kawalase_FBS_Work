//Write a program to check whether a given year is a leap year using Function

#include<stdio.h>

void leap();
void main()
{
	leap();
}
void leap()
{
	int year;
	
	printf("Enter the Year: ");
	scanf("%d",&year);
	
	if (year % 4 == 0 && year % 100 != 0 || year /400 == 0)
	{
		printf("Year is leap");
	}
	else
	{
		printf("Year is not leap");
	}
}