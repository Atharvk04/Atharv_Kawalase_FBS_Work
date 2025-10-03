void main ()
{
	int num = 15;
	
	if (num % 3 == 0 && num % 5 == 0)
	{
		printf("Number is Divided by Both");
	}
	else if ( num % 3 == 0)
	{
		printf("Num is Divided by 3");
	}
	else if (num % 5 == 0)
	{
		printf("Num is Divided by 5");
	}
	else
	{
		printf("Num is Divided by None");
	}
	
}