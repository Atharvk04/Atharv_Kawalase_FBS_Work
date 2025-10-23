#include<stdio.h>

void perfectNum (int *no);

void main ()
{
	int a;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	perfectNum (&a);
}

void perfectNum (int *no)
{
	int i=1, sum = 0;
	
	while (i<*no)
	{
		if (*no % i == 0)
		{
			sum +=i;
		}
		i++;
	}
	if (sum == *no)
		printf("Perfect Number.");
		
	else
		printf("Not perfect Number.");
}