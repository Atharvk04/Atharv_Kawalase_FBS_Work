#include<stdio.h>

void main ()
{
	int n, i , max, min;
	int arr [10];
	
	printf("Enter number of elements: ");
	scanf("%d",&n);
	
	printf("Enter elements: \n");
	
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	min = max = arr[0];
	
	for (i = 0; i < n; i++)
	{
		if(arr[i] < min)
			min = arr[i];
			
		if(arr[i] > max)
			max = arr [i];
			
	}
	
	printf("Min = %d \n",min);
	printf("Max = %d \n",max);
}