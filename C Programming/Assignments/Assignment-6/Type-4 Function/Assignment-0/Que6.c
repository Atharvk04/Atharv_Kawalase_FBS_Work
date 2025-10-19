#include<stdio.h>

int squareOfNum(int n1);
int cubeOfNum(int n1);
int square_cube(int n1);

void main ()
{
	int num;
	
	printf("Enter the number: ");
	scanf("%d",&num);
	
	int square = squareOfNum(num);
	printf("\nSquare: %d",square);
	
	int cube = cubeOfNum(num);
	printf("\nCube: %d",cube);
}

int squareOfNum(int num)
{
	int square = num * num;
	return square;
}
int cubeOfNum(int num)
{
	int cube = num * num * num;
	return cube;
}