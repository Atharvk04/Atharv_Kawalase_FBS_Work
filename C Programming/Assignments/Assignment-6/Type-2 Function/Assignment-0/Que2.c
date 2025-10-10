#include<stdio.h>

float area();

void main()
{
	float result;
	 
	result =area();
	
	printf("The area of the circle is: %f",result);
}

float area()
{
	float radius, a;
	
	printf("Enter the radius of circle: ");
	scanf("%f", &radius);
	
	a = 3.14 * radius * radius;
	
	return a;
}
