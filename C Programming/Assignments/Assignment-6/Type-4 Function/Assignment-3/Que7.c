#include<stdio.h>

int fact (int num);

void main ()
{
	int a, result;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	result = fact (a);
	
	printf("Factorial : %d",result);
}

int fact (int num)
{
	int fact = 1, i = 1;
	
	while(i <= num)
	{
		fact *= i;
		i++;
	}
	return fact;
}