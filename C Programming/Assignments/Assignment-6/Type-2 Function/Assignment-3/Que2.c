#include<stdio.h>

int table();

void main ()
{
	int result;
	
	result = table();
	
	printf("Result= %d",result);
}
int table ()
{
	int n, i=1;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	while (i<=10)
	{
		printf("%d\n",n*i);
		i++;
	}
	
	return 0;
}