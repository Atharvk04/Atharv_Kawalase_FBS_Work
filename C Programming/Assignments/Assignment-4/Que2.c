void main ()
{
	int n = 1000;
	
	for (int j=2;j<=n;j++)
	{
		int isPrime = 1;
		
		for (int i=2;i*i <=j;i++)
		{
			if (j%i==0)
			{
				isPrime = 0;
				break;
			}
		}
		if (isPrime)
		{
			printf("%d\n",j);
			
		}
	}
}