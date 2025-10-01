void main () {
	
	int a = 20;
	int b = 10;
	
	char op = '+';
	
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