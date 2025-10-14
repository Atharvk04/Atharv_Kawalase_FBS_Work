#include<stdio.h>

void range();

void main ()
{
	range();
}

void range ()
{
	int i;
	
	printf("Enter the Number: ");
	scanf("%d",&i);
	
	while (i<=10)
		{
			printf("\n%d",i);
			i++;
		}
}