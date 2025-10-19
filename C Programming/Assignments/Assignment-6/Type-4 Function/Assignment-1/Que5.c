#include<stdio.h>

int vote(int num1);

void main ()
{
	int age, result;
	
	printf("Enter the persons age: ");
	scanf("%d",&age);
	
	result = vote(age);
	
	if(result == 0)
		printf("Person is Eligible to Vote.");
		
	else
		printf("Person is Not Eligible to vote.");
}

int vote(int num1)
{
	if(num1 >= 18)
		return 0;
		
	else
		return 1;
}