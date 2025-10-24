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

    printf("Elements are: ");
    for (i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }
    
    printf("\n\nEnter the number to search: ");
    scanf("%d", &num);

    for (i = 0; i < 5; i++)
    {
        if (arr[i] == num)
        {
            printf("Number %d found at position %d \n", num, i+1);
            found = 1;
            break;
        }
    }

    if (found==0)
    {
        printf("Number %d not found in the array.\n", num);
    }
}