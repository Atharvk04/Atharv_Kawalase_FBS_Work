#include<stdio.h>
#include<stdlib.h>

void sumOfArr(int*);

void main()
{
	int* arr = (int*) malloc(sizeof(int) * 5);
	
	printf("Enter elements: ");
	
	for(int i=0; i < 5; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	sumOfArr(arr);
}

void sumOfArr(int* arr)
{
	int sum = 0;
	
	for (int i = 0; i < 5; i++)
    {
		sum += arr[i];
	}
	
	printf("Sum of all elements is: %d",sum);
} 