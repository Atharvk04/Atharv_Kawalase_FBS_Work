void main ()
{
	int n= 1000;
	
	for (int j = 1;j<=n;j++)
	{
		int no = j;
		int sum = 0;
		int temp = no;
		
		int digits = 0;
		
		while(temp != 0)
		{
			digits++;
			temp /=10;
		}
		
		temp = no;
		
		while (temp!= 0)
		{
			int digit = temp % 10;
			int power = 1;
			
			for (int i = 1;i<=digits; i++)
			{
				power *=digit;
			}
			
			sum +=power;
			temp /=10;
		}
		if (sum == no)
		{
			printf("%d\n",no);
		}
	}
}