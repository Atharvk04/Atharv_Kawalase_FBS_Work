#include<stdio.h>

int leap ();

void main ()
{
	int result;
	
	result = leap ();
	
	if (result == 0)
		printf("Year is leap");
	else
		printf("Year is not leap");
}

int leap()
{
	int year;
	
	printf("Enter the Year: ");
	scanf("%d",&year);
	
	if (year % 4 == 0 && year % 100 != 0 || year /400 == 0)
		return 0;
	else
		return 1;
}