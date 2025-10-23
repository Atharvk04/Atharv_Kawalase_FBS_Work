#include<stdio.h>

void pallindrome (int *num);

void main ()
{
	int a;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	pallindrome(&a);
}

void pallindrome (int *num)
{
	int temp, rev= 0, a;
	
	temp = *num;
	
	while (temp > 0)
	{
		a = temp % 10;
		rev = rev * 10 + a;
		temp = temp / 10;
	}
	
	if (*num==rev)
		printf("Number is pallindrome.");
		
	else
		printf("Number is not pallindrome.");
}