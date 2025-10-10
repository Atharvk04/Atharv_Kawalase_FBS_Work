//WAP to find area of triangle

#include<stdio.h>

void area();
void main()
{
	area();
}
void area()
{
	int base;
	int height;
	int area;
	
	
	
	printf("Enter the base of triangle: ");
	scanf("%d",&base);
	
	printf("\nEnter the Height of triangle: ");
	scanf("%d",&height);
	area = (base * height ) / 2;
	
	printf("\nArea of trianle : %d", area);
}