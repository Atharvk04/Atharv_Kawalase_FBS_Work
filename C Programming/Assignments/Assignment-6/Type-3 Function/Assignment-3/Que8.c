#include<stdio.h>

void strongOrNot( int no );

void main ()
{
	int num;
	
	printf("Enter a number: ");
	scanf("%d",&num);
	
	strongOrNot(num);
}

void strongOrNot( int no )
{
	int temp, rem, sum = 0;
	
	temp = no;
	
	while (temp >0)
	{
		rem = temp % 10;
		
		int fact = 1, i = 1;
		while (i <= rem)
		{
			fact *= i;
			i++;
		}
		sum += fact;
		temp /= 10;
	}
	
	if  (sum ==no)
		printf("Number is strong.");
	
	else
		printf("Number is not strong");
}