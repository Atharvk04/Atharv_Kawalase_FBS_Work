#include<stdio.h>

void main ()
{
	int arr [5]={1,2,3,4,5};
	int rev [5];
	int i;
	
	for (i = 0; i < 5; i++)
	{
		rev [i] = arr [4 - i];
	}
	
	printf("Reversed array: ");
	
	for (i = 0; i < 5; i++)
	{
		printf("%d ",rev[i]);
	}
}