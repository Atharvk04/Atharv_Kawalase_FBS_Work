#include<stdio.h>
#include<stdlib.h>

void minMax(int* , int);

void main()
{
	int* arr=(int*) malloc(sizeof(int) * 5);
	
	printf("Enter the elements: ");
	for(int i=0; i < 5; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	minMax(arr, 5);
}

void minMax(int* arr, int size)
{
	int minimum = arr[0];
	int maximum = arr[0];
	
	for (int i=0; i<size; i++)
	{
		if(arr[i] < maximum)
			maximum = arr[i];
		
		else if (arr[i] > minimum)
			minimum = arr [i];	
	}	
	
	printf("Minimum number is %d and maximum number is %d ",maximum, minimum);
}