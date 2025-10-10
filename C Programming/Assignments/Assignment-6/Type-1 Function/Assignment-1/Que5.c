//Write a program to check whether a person is eligible to vote (age = 18) using Function.

#include<stdio.h>

void vote();
void main()
{
	vote();
}
void vote()
{
	int age;
	
	printf("Please enter the age: ");
	scanf("%d",&age);
	
	if (age >= 18)
	{
		printf("Person is Eligible for Vote");
	}
	else 
	{
		printf("Person is not Eligible for vote");
	}
}