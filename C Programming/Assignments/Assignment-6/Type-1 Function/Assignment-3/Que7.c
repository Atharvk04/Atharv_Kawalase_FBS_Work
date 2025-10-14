#include<stdio.h>

void fact();

void main ()
{
	fact();
}

void fact()
{
	int n, fact = 1, i=1;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	while(i <= n)
	{
		fact *= i;
		i++;
	}
	printf("Factprial of %d is :%d",n,fact);
}