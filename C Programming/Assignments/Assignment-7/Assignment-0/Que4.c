#include<stdio.h>

void swap(int *a, int *b);

void main ()
{
	int num1, num2;
	
	printf("Enter two numbers: ");
	scanf("%d%d",&num1,&num2);
	
	swap (&num1, &num2);
}

void swap(int *a, int *b)
{
	int temp;
	
	temp = *a;
	a = *b;
	b = temp;
	
	printf("Numbers after swapping a= %d b=%d",a,b);
}