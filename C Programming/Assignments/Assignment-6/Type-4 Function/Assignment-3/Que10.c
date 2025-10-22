#include<stdio.h>

int addition ( int num);

void main ()
{
	int a, result;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	result = addition (a);
	
	printf("Addition of first and last digit is: %d",result);
}

int addition ( int num)
{
	int temp, last, first, sum;
	
	last = num % 10;
	temp = num;
	
	while(temp >= 10)
	{
		temp = temp/10;
	}
	
	first = temp;
	
	sum = first + last;
	
	return sum;
}