#include<stdio.h>

int pallindrome();

void main ()
{
	int result;
	
	result = pallindrome ();
	
	if ( result == 0)
		printf("Number is pallindrome");
		
	else
		printf("Number is not pallindrome");
}

int pallindrome()
{
	int n, temp, rev= 0, a;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	temp = n;
	
	while (temp > 0)
	{
		a = temp % 10;
		rev = rev * 10 + a;
		temp = temp / 10;
	}
	
	if (n==rev)
		return 0;
		
	else
		return 1;
}