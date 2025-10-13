#include<stdio.h>

int triangle();

void main ()
{
	int result;
	
	result = triangle();
	
	if(result == 0)
		printf("Triangle is Equilateral ");
	else if (result == 1)
		printf("Triangle is Isosceles");
	else
		printf("Triangle is Scalene");
}

int triangle ()
{
	int s1,s2,s3;
	
	printf("Enter the sides of Triangle: ");
	scanf("%d %d %d",&s1,&s2,&s3);
	
	if(s1==s2 && s2==s3)
	{
		return 0;
	}
	else 
	{
		if(s1==s3 || s1==s2 || s2==s3)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}