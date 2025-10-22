#include<stdio.h>

int armstrong ( int num);

void main ()
{
	int a, result;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	result = armstrong (a);
	
	if ( result == 0)
		printf("Number is armstrong.");
		
	else
		printf("Number is not armstrong.");
}

int armstrong ( int num)
{
	int rem, sum = 0, temp;
	
	temp = num;
	
	while (num >0)
	{
		rem = num % 10;
		sum = sum + rem*rem*rem;
		num = num/10;
	}
	
	if (sum == temp)

		return 0;	
	else
		return 1;
}