class triangle
{
	public static void main (String args [] )
{
	int s1 = 5, s2 = 9, s3 = 7;
	
	if(s1==s2 && s2==s3)
	{
		System.out.printf("Triangle is Equilateral");
	}
	else 
	{
		if(s1==s3 || s1==s2 || s2==s3)
		{
			System.out.printf("Triangle is Isosceles");
		}
		else
		{
			System.out.printf("Triangle is Scalene");
		}
	}
}
}