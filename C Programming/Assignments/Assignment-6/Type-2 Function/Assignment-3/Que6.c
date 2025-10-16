#include<stdio.h>

int perfectNum();

void main ()
{
	int result;
	
	result = perfectNum();
	
	if(result == 0)
		printf("Number is perfect");
		
	else
		printf("Number is not perfect");
}

int perfectNum()
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
		return 0;
		
	else
		return 1;
}