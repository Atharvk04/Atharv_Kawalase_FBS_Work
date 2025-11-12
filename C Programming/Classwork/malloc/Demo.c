#include <stdio.h>
#include <stdlib.h>
int* storedata(int*,int);
void printeven(int*,int);
void main()
{
	int size;
	printf("Enter the size: ");
	scanf("%d",&size);
	
	int*p = (int*)malloc(sizeof(int)*size);
	int* store = storedata(p,size);
	printeven(p,size);
}

int* storedata(int* a,int b)
{
	for(int i=0;i<b;i++)
	{
		printf("Enter the elements: ");
		scanf("%d",&a[i]);
	}
	return a;
}

void printeven(int*p,int size)
{
	for(int i=0;i<size;i++)
	{
		if(p[i] % 2== 0)
		{
			printf("Even numbers are:%d\n",p[i]);
		}
		
}