//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations using Function.

#include<stdio.h>

void numbers();
void main ()
{
	numbers();
}
void numbers ()
{
	int a = 20;
	int b = 10;
	
	char op;
	
	printf("Enter the Operator: ");
	scanf("%c",&op);
	
	if (op == '+')
	{
		printf("%d",a+b);
	}
	else if (op == '-')
	{
		printf("%d",a-b);
	}
	else if (op == '*')
	{
		printf("%d",a*b);
	}
	else if (op == '/')
	{
		printf("%d",a/b);
	}
	else
	{
		printf("Invalid Operator");
	}
}
