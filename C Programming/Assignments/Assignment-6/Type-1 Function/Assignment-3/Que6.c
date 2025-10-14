#include<stdio.h>

void perfectNum();

void main ()
{
	perfectNum();
}

void perfectNum()
{
	int n, i=1, sum = 0;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	while (i<n)
	{
		if (n % i == 0)
		{
			sum +=i;
		}
		i++;
	}
	if (sum == n)
	{
		printf("Number is Perfect");
	}
	else
	{
		printf("Number is Not Perfect");
	}
}