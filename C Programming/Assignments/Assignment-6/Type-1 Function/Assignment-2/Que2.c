//Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene usong Function.

#include<stdio.h>

void triangle();
void main()
{
	triangle();
}
void triangle()
{
	int s1, s2, s3;
	
	printf("Enter the sides of Triangle: ");
	scanf("%d %d %d",&s1,&s2,&s3);
	
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