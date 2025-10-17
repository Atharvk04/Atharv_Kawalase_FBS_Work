#include<stdio.h>

void area(float radius);

void main ()
{
	float r;
	
	printf("Please enter radius: ");
	scanf("%f",&r);
	
	area (r);
}
void area (float radius)
{
	float a;
	a = 3.14*radius*radius;
	
	printf("Area of the circle is: %.2f",a);
}