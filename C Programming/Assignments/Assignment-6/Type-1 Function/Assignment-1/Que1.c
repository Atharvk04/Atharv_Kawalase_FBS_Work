//Write a program to check whether a number is even or odd using Function.

#include<stdio.h>

void num();
void main()
{
	num();
}
void num()
{
	int num;
	
	printf("Enter the Number: ");
	scanf("%d",&num);
	
	if(num % 2 == 0)
	{
		printf("Number is even");
	}
	else 
	{
		printf("Number is odd");
	}
}