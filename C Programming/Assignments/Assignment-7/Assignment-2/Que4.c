#include<stdio.h>

void percentage (int *num1);

void main ()
{
	int marks;
	
	printf("Enter the Marks: ");
	scanf("%d",&marks);
	
	percentage(&marks);
}

void percentage (int *num1)
{
	if (*num1 >=75)
		printf("Distinction");
		
	else if(*num1 >=65)
		printf("First Class");
		
	else if(*num1 >=55)
		printf("Second Class");
		
	else if(*num1 >=40)
		printf("Pass");
		
	else
		printf("Fail");
}