#include<stdio.h>

int calculator (int *num1, int *num2);

void main ()
{
	int a ,b;
	
	printf("Enter the Numbers: ");
	scanf("%d%d",&a,&b);
	
	calculator (&a,&b);
}

int calculator (int *num1, int *num2)
{
	int res;
	char op;
	
	printf("Enter the Operator: ");
	fflush(stdin);
	scanf("%c",&op);
	
	if (op == '+')
	
		res = *num1 + *num2;
	
	else if (op == '-')
	
		res = *num1 - *num2;
	
	else if (op == '*')
	
		res = (*num1) * (*num2);

	else if (op == '/')
	
		res = (*num1) / (*num2);
	
	else
	{
		printf("Invalid Operator");
	}
	
	printf("Result = %d\n",res);
}