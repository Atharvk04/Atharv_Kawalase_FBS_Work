#include<stdio.h>

void range(int *n1);

void main ()
{
	int a;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	range(&a);
}

void range(int *n1)
{	
	printf("Numbers from %d to 10 are:\n",*n1);
	
	while (*n1<=10)
		{
			printf("%d\n",*n1); 
			(*n1)++; // *(n1++) increments the pointer, while (*n1)++ increments the value the pointer points to. 
		}
	
}