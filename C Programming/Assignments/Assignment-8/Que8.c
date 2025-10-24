#include<stdio.h>

void main ()
{
	int arr[5]={1,2,3,4,5};
	int brr[5]={6,7,8,9,10};
	int merged [10];
	int i, j;
	
	for (i = 0; i < 5; i++)
	{
		merged[i] = arr [i];
	}
	
	for (j = 0; j < 5; j++)
	{
		merged[i] = brr [j];
		i++;
	}
	
	printf("Merged array: ");
	for (i = 0; i < 10; i++)
	{
		printf("%d ", merged[i]);
	}
}