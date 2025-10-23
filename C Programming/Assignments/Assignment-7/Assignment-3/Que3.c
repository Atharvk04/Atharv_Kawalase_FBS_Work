#include<stdio.h>

void sumOfNum (int *start, int *end);

void main ()
{
	int a,b;
	
	printf("Enter the starting Number: ");
	scanf("%d",&a);
	
	printf("Enter the ending Number: ");
	scanf("%d",&b);
	
	sumOfNum(&a,&b);
}

void sumOfNum (int *start, int *end)
{
	int sum = 0;
	
	while (*start <= *end)
	{
		sum += *start;
		(*start)++;
	}
	
	printf("Sum of Numbers is: %d",sum);
}