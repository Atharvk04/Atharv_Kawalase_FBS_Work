#include<stdio.h>

int armstrong();

void main ()
{
	int result;
	
	result = armstrong();
	
	if(result == 0)
		printf("number is armstrong");
		
	else
		printf("number is not armstrong");
}

int armstrong()
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

		return 0;	
	else
		return 1;
}