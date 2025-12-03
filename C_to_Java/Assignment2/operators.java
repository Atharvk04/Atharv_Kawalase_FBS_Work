class operators
{
	public static void main (String args[]) {
	
	int a = 20;
	int b = 10;
	
	char op = '+';
	
	if (op == '+')
	{
		System.out.printf("%d",a+b);
	}
	else if (op == '-')
	{
		System.out.printf("%d",a-b);
	}
	else if (op == '*')
	{
		System.out.printf("%d",a*b);
	}
	else if (op == '/')
	{
		System.out.printf("%d",a/b);
	}
	else
	{
		System.out.printf("Invalid Operator");
	}
}
}