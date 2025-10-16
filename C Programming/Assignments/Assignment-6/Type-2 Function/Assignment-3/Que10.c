#include<stdio.h>

int addition();

void main()
{
	int result;
	
	result = addition();
	
	printf("Addition of first and last digit is: %d",result);
}

int addition()
{
	int num, temp, last, first, sum;
	
	printf("Enter the Number: ");
	scanf("%d",&num);
	
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