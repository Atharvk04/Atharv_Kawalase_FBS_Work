#include<stdio.h>

void vote(int n1);

void main ()
{
	int age;
	
	printf("Enter the age of person: ");
	scanf("%d",&age);
	
	vote(age);
}

void vote(int n1)
{
	if(n1 >= 18)
		printf("Person is eligible to vote.");
		
	else
		printf("Person is not eligible to vote.");
}