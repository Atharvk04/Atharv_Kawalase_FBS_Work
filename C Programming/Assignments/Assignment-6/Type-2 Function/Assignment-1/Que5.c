#include<stdio.h>

int eligibleToVote();

void main ()
{
	int result;
	
	result = eligibleToVote();
	
	if(result == 0)
		printf("Person is eligible to Vote");
	else
		printf("Person is not eligible");
}

int eligibleToVote()
{
	int age;
	
	printf("Enter the Age: ");
	scanf("%d",&age);
	
	if(age >= 18)
	
		return 0;
	
	else
		return 1;
}