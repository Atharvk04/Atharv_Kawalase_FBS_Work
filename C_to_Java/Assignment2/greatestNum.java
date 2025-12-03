class greatestNum
{
	public static void main (String args[])
{
	int a =12, b =78, c = 18;
	
	if(a>b)
	{
		if (a>c)
		{
			System.out.printf("%d",a);
		}
		else 
		{
			System.out.printf("%d",c);
		}
	}
	else
	{
		if(b>c)
		{
			System.out.printf("%d",b);
		}
		else
		{
			System.out.printf("%d",c);
		}
	}
}
}