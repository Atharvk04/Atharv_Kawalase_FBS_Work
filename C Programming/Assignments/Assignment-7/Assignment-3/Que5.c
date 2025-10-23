#include<stdio.h>

void armstrong (int *num);

void main ()
{
	int a;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	armstrong (&a);
}

void armstrong (int *num)
{
	int rem, sum = 0, temp;
	
	temp = *num;
	
	while (*num >0)
	{
		rem = *num % 10;
		sum = sum + rem*rem*rem;
		*num = *num/10;
	}
	
	if (sum == temp)

		printf("Number is armstrong.");
			
	else
		printf("Number is not armstrong.");
}