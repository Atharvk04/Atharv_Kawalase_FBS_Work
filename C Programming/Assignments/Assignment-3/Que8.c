#include<stdio.h>

void main ()
{
	int n = 145;
	int temp = n,rem, sum = 0;
	
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
	if  (sum ==n)
	{
		printf("Number is Strong");
	}
	else
	{
		printf("Number is not Strong");
	}
}