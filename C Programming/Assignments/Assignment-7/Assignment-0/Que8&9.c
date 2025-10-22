#include<stdio.h>

void areaAndPeri(int *len, int *bre);

void main ()
{
	int a, b;
	
	printf("Enter the length and breadth: ");
	scanf("%d%d",&a,&b);
	
	areaAndPeri(&a,&b);
}

void areaAndPeri(int *len, int *bre)
{
	int area = (*len) * (*bre);
	
	int perimeter = 2 * (*len + *bre);
	
	printf("Area of the rectangle is: %d and Primeter of rectangle is: %d",area,perimeter);
}