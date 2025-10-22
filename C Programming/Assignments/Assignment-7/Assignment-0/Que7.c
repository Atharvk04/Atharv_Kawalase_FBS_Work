#include<stdio.h>

void convert (int *totalminutes);

void main ()
{
	int minutes;
	
	printf("Enter Minutes: ");
	scanf("%d",&minutes);
	
	convert (&minutes);
}

void convert (int *totalminutes)
{
	int hours, remaining;
	
	hours = *totalminutes / 60;
    remaining = *totalminutes % 60;
	
	printf("\n%d minutes = %d hours and %d minutes",*totalminutes, hours, remaining); 
}