#include<stdio.h>
#include<stdlib.h>

void sumOfTwoArr(int*, int*, int*);

void main()
{
	int* arr = (int*) malloc(sizeof(int) * 5);
	printf("Enter elements in arr: ");
	
	for(int i=0; i < 5; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	int* brr = (int*) malloc(sizeof(int) * 5);
	printf("Enter elements in brr: ");
	
	for(int i=0; i < 5; i++)
	{
		scanf("%d",&brr[i]);
	}
	
	int crr[5];
	
	sumOfTwoArr(arr,brr,crr);
}

void sumOfTwoArr(int* arr, int* brr, int* crr)
{
	for (int i = 0; i < 5; i++)
	{
		crr [i] = arr [i] + brr [i];
	}
	
	printf("sum of two arrays: ");
	
	for (int i = 0; i < 5; i++)
	{
		printf("%d ",crr[i]);
	}
}