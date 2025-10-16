#include<stdio.h>

void main ()
{
	int n = 1000;
	
	for (int j=1;j<=n;j++)
	{
		int sum = 0;
		
		for (int i= 1;i<=j/2;i++)
		{
			if(j%i==0)
			{
				sum += i;
			}
		}
		if (sum == j && j!=0)
		{
			printf("%d\n",j);
		}
		
	}
}