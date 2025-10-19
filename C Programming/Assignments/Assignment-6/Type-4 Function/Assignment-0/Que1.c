#include<stdio.h>

int sum (int a, int b);

void main ()
{
	int num1, num2, result;
	
	printf("Enter two numbers: ");
	scanf("%d%d",&num1,&num2);
	
	result = sum (num1,num2);
	
	printf("The sum is: %d",result);
}

int sum (int a, int b)
{
	int c;
	c=a+b;
	return c;
}