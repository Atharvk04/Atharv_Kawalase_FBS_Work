#include<stdio.h>

int ageCategory (int age);

void main ()
{
	int age, result;
	
	printf("Enter the age: ");
	scanf("%d",&age);
	
	result = ageCategory (age);
	
	if(result == 0)
		printf("Person is child");
		
	else if(result == 1)
		printf("Person is Teenager");
		
	else if(result == 2)
		printf("Person is Adult");
		
	else if (result == 3)
		printf("Person is Senior");
}

int ageCategory (int age)
{
	if( age < 12)
	
		return 0;
	
	else if (age <=19 )
	
		return 1;
	
	else if ( age <= 50)
	
		return 2;
	
	else
	
		return 3;
}