#include<stdio.h>

int num();
void main ()
{
	int result;
	result = num();
	
	if (result == 0)
		printf("Number is even ");
	else
		printf("Number is odd ");
}
int num ()
{
	int no;
	
	printf("Enter the Number: ");
	scanf("%d",&no);
	
	if(no %2 ==0)
		return 0;
	else
		return 1;
	
}