#include<stdio.h>

void primeNum(int* , int);

void main()
{
	int arr [10];
	printf("Enter elements: ");
	
	for(int i=0; i < 10; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	primeNum(arr,10);
}

void primeNum(int*arr , int size)
{
	int i,j,count;
	
	printf("Prime numbers: ");
	
	for (i = 0; i < size; i++)
	{
		if (arr[i] <= 1)
			continue;
		
		count = 0;
		
		for(j = 1; j <= arr[i]; j++)
		{
			if (arr [i] % j == 0)
			count ++;
		}
		
		if (count == 2)
			printf("%d ",arr[i]);
	}
}