#include<stdio.h>

void leap (int *no);

void main ()
{
	int year;
	
	printf("Enter a Year: ");
	scanf("%d",&year);
	
	leap (&year);
}

void leap (int *no)
{
	if (*no % 4 == 0 && *no % 100 != 0 || *no /400 == 0)
		printf("Year is leap.");
		
	else
		printf("Year is not leap.");
}