class division
{
	public static void main (String args[] )
{
	int num = 15;
	
	if (num % 3 == 0 && num % 5 == 0)
	{
		System.out.printf("Number is Divided by Both");
	}
	else if ( num % 3 == 0)
	{
		System.out.printf("Num is Divided by 3");
	}
	else if (num % 5 == 0)
	{
		System.out.printf("Num is Divided by 5");
	}
	else
	{
		System.out.printf("Num is Divided by None");
	}
	
}
}