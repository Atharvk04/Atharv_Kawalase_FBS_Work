// WAP to Print even and odd numbers in given range.

void main ()
{
	int n = 15;
	for(int i=1; i<=n; i++)
	{
		if(i % 2 == 0)
		{
			printf("Even number: %d\n",i);
		}
		
		else
		{
			printf("\n");
			printf("Odd Number:%d\n",i);
			printf("\n");
		}
	}
}