#include<stdio.h>

int prime (int num);

void main ()
{
	int a, result;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	result = prime (a);
	
	if(result  == 0)
		printf("Number is Prime.");
		
	else
		printf("Number is not prime");
}

int prime (int num)
{
	int i = 2, flag = 0;
	
	while(i < num)
	{
		if(num % i ==0)
		{
			flag =1;
			break;
		}
		i++;
	}
	
	if(flag == 0)
		return 0;
	else
		return 1;
}