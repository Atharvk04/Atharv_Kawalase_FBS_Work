#include<stdio.h>

void add();

void main ()
{
	add();
}

void add()
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
	
	printf("Sum = %d (%d + %d)\n", sum, first, last);
	 
}