// Write a Program in C to find area of circle with Function

#include<stdio.h>

void area();
void main ()
{
	area ();
}

void area()
{
	float radius;
	float area ;
	
	
	
	printf("Radius Of the Circle is:");
	scanf("%f",&radius);
	
	area = 3.14 * radius * radius;
	printf("Area of circle is : %f",area);
}