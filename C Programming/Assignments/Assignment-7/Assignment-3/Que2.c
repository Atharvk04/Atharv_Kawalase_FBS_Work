#include<stdio.h>

void table (int *n);

void main ()
{
	int a;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	table (&a);
}

void table (int *n)
{
	int i=1;
	
	while (i<=10)
	{
		printf("%d\n",*n * i);
		i++;
	}
}