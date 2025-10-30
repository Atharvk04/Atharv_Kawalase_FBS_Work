#include<stdio.h>

void evenOdd(int*);

void main()
{
	int arr[5];
	printf("Enter elements: ");
	
	for(int i=0; i<5; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	evenOdd(arr);
}

void evenOdd(int* arr)
{
	
	for(int i=0;i<5;i++)
	{
		(arr[i] %2 == 0) ? printf("\nEven = %d",arr[i]) : printf("\nOdd = %d",arr[i]);
	}
	

}