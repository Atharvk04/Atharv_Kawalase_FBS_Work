//Write a C program to add 2 numbers with Function

#include<stdio.h>

void sum (); // Function Declaration
void main () 
{
	sum ();	
	sum ();
}
	
void sum () //Function Definition
{
	int a, b, c;
	
	printf("\nEnter the Numbers:");
	scanf("%d%d",&a,&b);
	
	c = a + b;
	
	printf("The addition of %d and  %d is: %d",a,b,c);
	
}