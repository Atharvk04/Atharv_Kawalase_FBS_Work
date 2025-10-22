#include<stdio.h>

int triangle (int num1, int num2, int num3);

void main ()
{
	int a, b, c, result;
	
	printf("Enter the sides of triangle: ");
	scanf("%d%d%d",&a,&b,&c);
	
	result = triangle(a,b,c);
	
	if (result == 0)
		printf("Triangle is equilateral.");
		
	else if(result == 1)
		printf("Triangle is Isosceles");
		
	else
		printf("Triangle is Scalene");
}

int triangle (int num1, int num2, int num3)
{
	if(num1==num2 && num2==num3)
	{
		return 0;
	}
	else 
	{
		if(num1==num3 || num1==num2 || num2==num3)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
}