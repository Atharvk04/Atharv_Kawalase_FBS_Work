#include<stdio.h>

int percentage (int num1);

void main ()
{
	int marks,result;
	
	printf("Enter the marks: ");
	scanf("%d",&marks);
	
	result = percentage (marks);
	
	if(result == 0)
		printf("Distinction");
		
	else if (result == 1)
		printf("First Class");
		
	else if (result == 2)
		printf("Second class");
		
	else if (result == 3)
		printf("Pass");
		
	else
		printf("Fail");
}

int percentage(int num1)
{
	if (num1 >=75)
		return 0;
		
	else if(num1 >=65)
		return 1;
		
	else if(num1 >=55)
		return 2;
		
	else if(num1 >=40)
		return 3;
		
	else
		return 4;
}