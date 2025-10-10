/* Accept the age and check if the person is:
Child (age < 12),Teenager (12–19),Adult (20–59),Senior (60 and above) */

#include<stdio.h>

void age();
void main ()
{
	age();
}

void age()
{
	int age;
	
	printf("Enter the age of person: ");
	scanf("%d",&age);
	
	if( age < 12)
	{
		printf("Person is child");
	}
	else if (age <=19 )
	{
		printf("Person is Teenager");
	}
	else if ( age <= 50)
	{
		printf("Person is Adult");
	}
	else
	{
		printf("Person is Senior");
	}
}