#include<stdio.h>

int pallindrome (int num);

void main ()
{
	int a, result;
	
	printf("Enter a Number: ");
	scanf("%d",&a);
	
	result = pallindrome (a);
	
	if( result == 0 )
		printf("Number is pallindrome.");
		
	else
		printf("Number is not pallindrome.");
}

int pallindrome (int num)
{
	int temp, rev =0, b;
	
	temp = num;
	
	while (temp > 0)
	{
		b = temp % 10;
		rev = rev * 10 + b;
		temp = temp / 10;
	}
	
	if (num==rev)
		return 0;
		
	else
		return 1;
}