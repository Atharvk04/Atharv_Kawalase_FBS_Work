/* WAP in C for, find common elements in two arrays.
eg. arr=12345
	brr=16732
o/p = 123*/

#include<stdio.h>

void main()
{
	int arr[] = {6,3,4,1,9};
	int brr[] = {7,5,4,3,1};
	
	printf("Common elemts are: ");
	for(int i = 0; i < 5; i++)
		for(int  j= 0; j < 5; j++)
		{
			if(arr[i]==brr[j])
			{
				printf("%d ",arr[i]);
				break;
			}
		}
}