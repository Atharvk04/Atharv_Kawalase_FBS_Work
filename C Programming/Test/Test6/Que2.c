//WAP in C to find two maximum number in array.

#include<stdio.h>

void main ()
{
	int n, i;
	int arr[10];
	int max1, max2;
	
	printf("Enter number elements: ");
	scanf("%d",&n);
	
	printf("Enter elements: \n");
	
	for(i = 0; i < n; i++)
	{
		scanf("%d",&arr[i]);
	}
	
	if(arr[0]>arr[1])
	{
		max1=arr[0];
		max2=arr[1];
	}
	else
	{
		max1=arr[1];
		max2=arr[0];
	}
	
	for(i = 2; i < n; i++) {
        if(arr[i] > max1) {
            max2 = max1;
            max1 = arr[i];
        } else if(arr[i] > max2 && arr[i] != max1) {
            max2 = arr[i];
        }
    }

    printf("\nTwo maximum numbers are: %d and %d\n", max1, max2);
}

