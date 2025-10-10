//WAP to find Perimeter of Rectangle using Function

#include<stdio.h>

void perimeter();
void main ()
{
	perimeter();
}
void perimeter()
{
	int length , width, perimeter;
	
	printf("Enter the length of Rectangle: ");
	scanf("%d",&length);
	
	printf("Enter the width of Rectangle: ");
	scanf("%d",&width);
	
	perimeter = 2 * (length + width);
	
	printf("\nPerimeter of rectangle is : %d", perimeter);
}