#include<stdio.h>

void main ()
{
	int n, i, j, count;
	int arr [10];
	
	printf("Enter number of elements: ");
	scanf("%d",&n);
	
	printf("Elements are: ");
	
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Prime numbers: ");
	
	for (i = 0; i < n; i++)
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