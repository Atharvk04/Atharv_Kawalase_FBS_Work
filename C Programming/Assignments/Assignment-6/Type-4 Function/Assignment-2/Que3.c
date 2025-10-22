#include<stdio.h>

int greatestNumber(int num1, int num2, int num3);

void main ()
{
	int a,b,c,result;
	
	printf("Enter the Numbers: ");
	scanf("%d%d%d",&a,&b,&c);
	
	result = greatestNumber(a,b,c);
	
	if (result == 0)
		printf("A is gretest.");
		
	else if (result == 1)
		printf("B is greatest.");
		
	else
		printf("C is greatest.");
}

int greatestNumber(int num1, int num2, int num3)
{
	if(num1>=num2 && num1>=num3)
		return 0;
		
	else if (num2>=num1 && num2>=num3)
		return 1;
		
	else
		return 2;
}