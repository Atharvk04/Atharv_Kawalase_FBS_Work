#include<stdio.h>

void prime (int *no);

void main ()
{
	int a;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	prime (&a);
}

void prime (int *no)
{
	if (*no % 2 == 0)
		printf("Number is Prime.");
		
	else
		printf("Number is not Prime.");
}