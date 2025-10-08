//sum of digit

void main ()
{
	int num = 589;
	int rem, sum =0;
	
	while (num > 0)
	{
		rem = num % 10;
		sum = sum + rem;
		num = num /10;
	}
	
	printf("Sum of 589 is :%d",sum);
}