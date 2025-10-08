// WAP to add alternate numbers from given range

void main ()
{
	int sum = 0;
	int n = 7;
	for(int i=1;i<=n;)
	{
		sum = sum+i;
		i = i+2;
	}
	
	printf("Addition of Numbers is :%d",sum);
}