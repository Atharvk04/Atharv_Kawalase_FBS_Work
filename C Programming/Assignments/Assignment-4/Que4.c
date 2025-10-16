#include<stdio.h>

void main ()
{
	int n = 1000;
	
	for (int j=1;j<=n;j++)
	{
		int sum = 0;
		int temp = j;
		
		while (temp > 0)
		{
			int digit = temp % 10;
			
			int fact = 1;
			
			for ( int i =1;i <=digit; i++)
			{
				fact *=i;
			}
			
			sum +=fact;
			temp /= 10;
		}
		if (sum==j)
		{
			printf("%d\n",j);
		}
	}
}