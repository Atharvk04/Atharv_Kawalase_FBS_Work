#include<stdio.h>

void main ()
{
	int n, i;
	int arr[10];
	
	printf("Enter number of elements: ");
	scanf("%d",&n);
	
	printf("Elements are: \n");
	
	for (i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Alternate numbers are :\n");
	
	for (i = 0; i < n; i+=2)
		printf(" %d", arr[i]);
}