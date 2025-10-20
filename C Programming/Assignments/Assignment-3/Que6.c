void main ()
{
	int n = 28;
	int i = 1, sum = 0;
	
	while (i<n)
	{
		if (n % i == 0)
		{
			sum +=i;
		}
		i++;
	}
	if (sum == n)
	{
		printf("Number is Prime");
	}
	else
	{
		printf("Number is Not Prime");
	}

}
