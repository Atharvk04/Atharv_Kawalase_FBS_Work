#include<stdio.h>

int range();

void main()
{
	int result;	
	
	result = range();
	
	printf("Result = %d",result);
}
int range()
{
	int i;
	
	printf("Enter the Number: ");
	scanf("%d",&i);
	
	printf("Numbers from %d to 10 are:\n",i);
	
	while (i<=10)
		{
			printf("%d\n",i);
			i++;
		}
	return 0;
}