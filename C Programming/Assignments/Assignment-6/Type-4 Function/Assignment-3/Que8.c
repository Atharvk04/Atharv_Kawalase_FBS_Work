#include<stdio.h>

int strongOrNot(int num);

void main ()
{
	int a, result;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	result = strongOrNot(a);
	
	if( result == 0)
		printf("Number is strong.");
		
	else
		printf("Number is not strong.");
}

int strongOrNot(int num)
{
	int temp, rem, sum =0;
	
	temp = num;
	
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
	
	if  (sum ==num)
		return 0;
	
	else
		return 1;
}