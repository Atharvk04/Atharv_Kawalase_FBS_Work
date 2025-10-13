#include<stdio.h>

int percentage();

void main ()
{
	int result;
	
	result = percentage();
	
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

int percentage()
{
	int marks;
	
	printf("Enter the Marks: ");
	scanf("%d",&marks);
	
	if (marks >=75)
		return 0;
		
	else if(marks >=65)
		return 1;
		
	else if(marks >=55)
		return 2;
		
	else if(marks >=40)
		return 3;
		
	else
		return 4;
}