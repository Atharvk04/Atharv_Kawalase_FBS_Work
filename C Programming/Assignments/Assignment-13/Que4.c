#include<stdio.h>
#include<stdlib.h>

void evenOdd(int*);

void main()
{
	int* arr=(int*) malloc(sizeof(int) * 7);
	printf("Enter elements: ");
	
	for(int i=0; i<7; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	evenOdd(arr);
}

void evenOdd(int* arr)
{
	
	for(int i=0;i<7;i++)
	{
		(arr[i] %2 == 0) ? printf("\nEven = %d",arr[i]) : printf("\nOdd = %d",arr[i]);
	}
	

}