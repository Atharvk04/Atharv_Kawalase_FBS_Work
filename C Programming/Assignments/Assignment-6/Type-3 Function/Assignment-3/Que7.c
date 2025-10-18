#include<stdio.h>

void fact(int no);

void main ()
{
	int a;
	
	printf("Enter a number: ");
	scanf("%d",&a);
	
	fact(a);
}

void fact(int no)
{
	int fact = 1, i=1;
	
	while(i <= no)
	{
		fact *= i;
		i++;
	}
	printf("Factorial : %d",fact);
}