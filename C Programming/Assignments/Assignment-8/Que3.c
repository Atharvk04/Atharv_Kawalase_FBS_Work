#include<stdio.h>

void main()
{
    int arr[5];
    int i, num, found = 0, sum = 0;

    printf("Enter elements: ");
    for (i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (i = 0; i < 5; i++)
    {
		sum += arr[i];
	}
	
	printf("Sum of all elements is: %d",sum);
}