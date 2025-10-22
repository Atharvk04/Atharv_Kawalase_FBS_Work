#include<stdio.h>

int perfectNum (int num);

void main ()
{
	int a, result;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	result = perfectNum (a);
	
	if ( result == 0)
		printf("Number is perfect.");
	
	else
		printf("Number is not perfect.");
}

int perfectNum (int num)
{
	int i = 1, sum = 0;
	
	while (i<num)
	{
		if (num % i == 0)
		{
			sum +=i;
		}
		i++;
	}
	if (sum == num)
		return 0;
		
	else
		return 1;
}