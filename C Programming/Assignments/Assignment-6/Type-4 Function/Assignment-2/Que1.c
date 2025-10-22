#include<stdio.h>

int calculator (int num1, int num2);

void main ()
{
	int a, b, result;
	
	printf("Enter the Numbers: ");
	scanf("%d%d",&a,&b);
	
	result = calculator (a,b);
	
	printf("Result = %d\n",result);
}

int calculator (int num1, int num2)
{
	int res;
	char op;
	
	printf("Enter the Operator: ");
	fflush(stdin);
	scanf("%c",&op);
	
	if (op == '+')
	
		res = num1 + num2;
	
	else if (op == '-')
	
		res = num1 - num2;
	
	else if (op == '*')
	
		res = num1 * num2;

	else if (op == '/')
	
		res = num1 / num2;
	
	else
	{
		printf("Invalid Operator\n");
		
		return 0;
	}
	
	return res;
}