#include<stdio.h>

void triangle(int *num1, int *num2, int *num3);

void main ()
{
	int a,b,c;
	
	printf("Enter the sides of triangle: ");
	scanf("%d%d%d",&a,&b,&c);
	
	triangle(&a,&b,&c);
}

void triangle(int *num1, int *num2, int *num3)
{
	if(*num1 == *num2 && *num2 == *num3)
		printf("Triangle is equilateral.");
	
	else
	{
		if(*num1 == *num2 || *num1 == *num3 || *num2 == *num3)
			printf("Triangle is Isosceles.");
			
		else
			printf("Triangle is Scalene.");
	}
}