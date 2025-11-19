//Que2.: Check if the array is pallindrome or not (using function)

#include<stdio.h>

void pallindrome(int* , int );
void main()
{
	int arr[5] = {1,2,3,2,1};
	pallindrome(arr,5);
}

void pallindrome(int* arr, int size)
{
	
	int i, flag = 1;
	
	for(i = 0; i < size/2; i++)
	{
		if(arr[i] != arr[size-1-i])
		{
			flag = 0;
			break;
		}
	}
	
	if(flag == 1)
		printf("\nArray is Pallindrome.\n");
	
	else
		printf("Array is not Pallindrome.");
	
}