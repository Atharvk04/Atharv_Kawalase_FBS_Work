#include<stdio.h>

void triangle(int num1, int num2, int num3);

void main ()
{
	int s1, s2, s3;
	
	printf("Enter the Sides of triangle: ");
	scanf("%d%d%d",&s1,&s2,&s3);
	
	triangle(s1,s2,s3);
}

void triangle(int num1, int num2, int num3)
{
	
	if(num1==num2 && num2==num3)
	{
		printf("Triangle is equilateral.");
	}
	else 
	{
		if(num1==num3 || num1==num2 || num2==num3)
		{
			printf("Triangle is Isosceles");
		}
		else
		{
			printf("Triangle is Scalene");
		}
	}
}