void main ()
{
	int n = 123;
	int temp = n;
	int rev = 0, a;
	
	while (temp > 0)
	{
		a = temp % 10;
		rev = rev * 10 + a;
		temp = temp / 10;
	}
	
	if (n==rev)
	{
		printf("Pallindrome");
	}
	else
	{
		printf("Not pallindrome");
	}
}