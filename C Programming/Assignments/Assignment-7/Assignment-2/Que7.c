#include<stdio.h>

void ageCategory(int *age);

void main ()
{
	int age;
	
	printf("Enter the age of person: ");
	scanf("%d",&age);
	
	ageCategory(&age);
}

void ageCategory(int *age)
{
	if( *age < 12)
	
		printf("Person is child");
	
	else if (*age <=19 )
	
		printf("Person is Teenager");
	
	else if ( *age <= 50)
	
		printf("Person is Adult");
	
	else
	
		printf("Person is Senior");
}