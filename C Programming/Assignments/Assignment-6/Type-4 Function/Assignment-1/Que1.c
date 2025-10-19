#include<stdio.h>

int evenOrOdd(int num1);

void main ()
{
	int a, result;
	
	printf("Enter the number: ");
	scanf("%d",&a);
	
	result = evenOrOdd(a);
	
	if (result == 0)
		printf("Number is even.");
		
	else
		printf("Number is Odd.");
}

int evenOrOdd(int num1)
{
	if(num1 % 2 == 0)
		return 0;
	
	else
		return 1;
}