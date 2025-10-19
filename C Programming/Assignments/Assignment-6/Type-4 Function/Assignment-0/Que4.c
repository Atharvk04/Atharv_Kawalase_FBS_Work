#include<stdio.h>

int swap (int a, int b);

void main ()
{
	int num1, num2, result;
	
	printf("Enter the Numbers: ");
	scanf("%d%d",&num1,&num2);
	
	result = swap (num1, num2);
	
	printf("Numbers after swapping: %d",result);
}

int swap (int a, int b)
{
	int temp;
	
	temp = a;
	a=b;
	b=temp;
	
	return temp;
}