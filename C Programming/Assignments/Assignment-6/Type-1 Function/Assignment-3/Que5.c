#include<stdio.h>

void armstrong();

void main ()
{
	armstrong();
}

void armstrong()
{
	int num, rem, sum = 0, temp;
	
	printf("Enter the Number: ");
	scanf("%d",&num);
	
	temp = num;
	
	while (num >0)
	{
		rem = num % 10;
		sum = sum + rem*rem*rem;
		num = num/10;
	}
	
	if (sum == temp)

	{
		printf("Number is Armstrong");
	}	
	else
	{
		printf("Number is not Armstrong");
	}
}