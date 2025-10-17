#include<stdio.h>

void sum (int a,int b);

void main ()
{
	int num1, num2;
	
	printf("Enter the Two Numbers: ");
	scanf("%d%d",&num1,&num2);
	
	sum (num1, num2);
}
void sum (int a, int b)
{
	int c;
	
	c=a+b;
	
	printf("The sum is: %d",c);
}