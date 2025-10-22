#include<stdio.h>

void greatestNumber(int *num1, int *num2, int *num3);

void main ()
{
	int a, b,c;
	
	printf("Enter the Numbers: ");
	scanf("%d%d%d",&a,&b,&c);
	
	greatestNumber(&a,&b,&c);
}

void greatestNumber(int *num1, int *num2, int *num3)
{
	if(*num1>=*num2 && *num1>=*num3)
		printf("a is greatest number.");
		
	else if (*num2>=*num1 && *num2>=*num3)
		printf("b is greatest number.");
		
	else
		printf("c is greatest number.");
}