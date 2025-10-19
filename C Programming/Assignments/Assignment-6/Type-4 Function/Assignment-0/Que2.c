#include<stdio.h>

float area (float radius);

void main ()
{
	float r, result;
	
	printf("Enter the Radius: ");
	scanf("%f",&r);
	
	result = area (r);
	
	printf("Area of the circle is: %.2f",result);
}

float area (float radius)
{
	float a;
	
	a = 3.14*radius*radius;
	
	return a;
}