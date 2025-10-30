#include<stdio.h>

void sumOfTwoArr(int*, int*, int*);

void main()
{
	int arr[5] = {11,22,32,44,55};
	int brr[5] = {10,20,30,40,50};
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