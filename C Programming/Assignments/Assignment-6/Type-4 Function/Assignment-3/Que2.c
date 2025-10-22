#include<stdio.h>

int table (int num);

void main ()
{
	int a, result;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	result = table (a);
}

int table (int num)
{
	int i = 1;
	
	while (i<=10)
	{
		printf("%d\n",num*i);
		i++;
	}
	
	return 0;
}