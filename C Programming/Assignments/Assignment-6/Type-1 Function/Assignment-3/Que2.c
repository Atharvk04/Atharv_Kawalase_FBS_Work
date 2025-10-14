#include<stdio.h>

void table();

void main()
{
	table();
}

void table ()
{
	int n, i=1;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	while (i<=10)
	{
		printf("\n%d",n*i);
		i++;
	}
}