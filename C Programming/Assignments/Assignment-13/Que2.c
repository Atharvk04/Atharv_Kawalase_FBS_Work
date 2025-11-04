#include<stdio.h>
#include<stdlib.h>

void search(int*, int, int*);

void main()
{
	int* arr = (int*) malloc (sizeof(int) * 5);
	
	printf("Enter elements: ");
	for(int i=0; i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("\nEnter a number do you want to search: ");
	int num;
	scanf("%d",&num);
	
	search(arr,5,&num);
}

void search(int* arr, int size, int* num)
{
	int found =0 ;
	
	 for (int i = 0; i < size; i++)
    {
        if (arr[i] == *num)
        {
            printf("Number %d found at position %d \n", *num, i+1);
            found = 1;
            break;
        }
    }

    if (found==0)
    {
        printf("Number %d not found in the array.\n", *num);
    }
}