#include<stdio.h>

int fact();

void main()
{
	int result;
	
	result = fact();
	
	printf("Factorial : %d",result);
}

int fact ()
{
	int n, fact = 1, i=1;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	while(i <= n)
	{
		fact *= i;
		i++;
	}
	return fact;
}