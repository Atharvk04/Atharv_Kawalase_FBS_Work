#include<stdio.h>

void main ()
{
	int n, i;
	int arr[10];
	
	printf("Enter number elements: ");
	scanf("%d",&n);
	
	printf("Enter elements: \n");
	
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEven Numbers:");
	
	for (i = 0; i < n; i++)
	{
		if(arr[i] % 2 == 0)
			printf("%d ",arr[i]);
	}
	
	printf("\nOdd Numbers:");
	
	for (i = 0; i < n; i++)
	{
		if(arr[i] % 2 != 0)
			printf("%d ",arr[i]);
	}
}