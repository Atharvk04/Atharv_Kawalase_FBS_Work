#include<stdio.h>

int menuDriven();

void main ()
{
	int result;
	
	result = menuDriven();
	
	printf("Result = %d",result);
}

int menuDriven()
{
	int a,b,res;
	char op;
	
	printf("Enter the numbers: ");
	scanf("%d%d",&a,&b);
	
	printf("Enter the Operator: ");
	fflush(stdin);
	scanf("%c",&op);
	
	if (op == '+')
	
		res = a + b;
	
	else if (op == '-')
	
		res = a - b;
	
	else if (op == '*')
	
		res = a * b;

	else if (op == '/')
	
		res = a / b;
	
	else
	{
		printf("Invalid Operator");
		
		return 0;
	}
	
	return res;
}