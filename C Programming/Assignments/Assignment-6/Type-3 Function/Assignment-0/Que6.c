#include<stdio.h>

void squareAndCube(int n1);

void main()
{
	int a;
	
	printf("Enter the Number: ");
	scanf("%d",&a);
	
	squareAndCube(a);
}

void squareAndCube(int n1)
{
	int square = n1*n1;
	
	int cube = n1*n1*n1;
	
	printf("Square of the number is: %d and Cube of number is: %d",square,cube);
}