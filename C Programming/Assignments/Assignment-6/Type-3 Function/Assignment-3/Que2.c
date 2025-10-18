#include<stdio.h>

void table(int n);

void main ()
{
	int n;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	table(n);
}

void table(int n)
{
	int i=1;
	
	while (i<=10)
	{
		printf("%d\n",n*i);
		i++;
	}
	
}