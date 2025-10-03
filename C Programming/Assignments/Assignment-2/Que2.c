void main ()
{
	int s1 = 5, s2 = 9, s3 = 7;
	
	if(s1==s2 && s2==s3)
	{
		printf("Triangle is Equilateral");
	}
	else 
	{
		if(s1==s3 || s1==s2 || s2==s3)
		{
			printf("Triangle is Isosceles");
		}
		else
		{
			printf("Triangle is Scalene");
		}
	}
}