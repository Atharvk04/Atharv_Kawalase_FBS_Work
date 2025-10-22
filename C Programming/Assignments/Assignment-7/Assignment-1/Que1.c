#include<stdio.h>

void evenOrOdd(int *a);

void main ()
{
	int num1;
	
	printf("Enter a Number: ");
	scanf("%d",&num1);
	
	evenOrOdd(&num1);
}

void evenOrOdd(int *a)
{
	if (*a % 2 == 0)
		printf("Number is even.");
		
	else
		printf("Number is odd.");
}