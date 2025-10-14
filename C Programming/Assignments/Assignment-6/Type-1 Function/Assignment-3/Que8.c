#include<stdio.h>

void strongOrNot();

void main ()
{
	strongOrNot();
}
void strongOrNot()
{
	int n, temp, rem, sum = 0;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	temp = n;
	
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