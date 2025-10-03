void main ()
{
	int a =12, b =78, c = 18;
	
	if(a>b)
	{
		if (a>c)
		{
			printf("%d",a);
		}
		else 
		{
			printf("%d",c);
		}
	}
	else
	{
		if(b>c)
		{
			printf("%d",b);
		}
		else
		{
			printf("%d",c);
		}
	}
}