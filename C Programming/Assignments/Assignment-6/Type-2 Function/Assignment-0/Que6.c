#include<stdio.h>
int squareOfNum();
int cubeOfNum();
int square_cube();

void main()
{
	int num;
	printf("Enter the number: ");
	scanf("%d",&num);
	
	int square = squareOfNum(num);
	printf("\nSquare: %d",square);
	
	int cube = squareOfNum(num);
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