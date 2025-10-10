//WAP to find the square and cube of number using Function

#include<stdio.h>

void num();
void main ()
{
	num ();
}
void num ()
{
	int a;
	int square ,cube;
	
	square = a * a;
	cube = a * a * a;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	square = a * a;
	printf("\nSquare of the number : %d",square);
	
	cube = a * a * a;
	printf("\nCube of the number : %d",cube); 
}