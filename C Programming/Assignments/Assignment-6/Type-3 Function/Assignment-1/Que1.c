#include<stdio.h>

void evenOrOdd(int n1);

void main ()
{
	int a;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	evenOrOdd(a);
}

void evenOrOdd(int n1)
{
	if(n1 % 2 == 0)
		printf("Number is Even.");
	
	else
		printf("Number is Odd.");
}