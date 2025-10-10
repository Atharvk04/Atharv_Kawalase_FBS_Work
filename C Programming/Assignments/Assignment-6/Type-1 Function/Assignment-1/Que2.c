//Write a program to check given 3 digit number is pallindrome or not using Function.

#include<stdio.h>
void pallindrome();
void main()
{
	pallindrome();
}
void pallindrome()
{
	int num;
	
	printf("Enter the Number: ");
	scanf("%d",&num);
	
	int r1,r2,r3,rev;
	int q1;
	
	r1 = num % 10;
	q1 = num / 10;
	r2 = q1 % 10;
	r3 = q1 / 10;
	
	rev = r1*100 + r2 *10 + r3;
	
	if (rev == num)
	{
		printf("Number is pallindrome");
	}
	else 
	{
		printf("Number is not pallindrome");
	}
}