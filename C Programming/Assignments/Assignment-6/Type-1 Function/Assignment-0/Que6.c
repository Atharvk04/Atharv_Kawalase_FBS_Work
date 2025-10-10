// WAP to find the average of numbers using Function

#include<stdio.h>

void average();
void main ()
{
	average();
}
void average()
{
	int n1, n2, n3, n4, n5;
	float average;
	
	
	 
	
	printf("Enter the Numbers: ");
	scanf("%d%d%d%d%d",&n1, &n2, &n3, &n4, &n5);
	
	average = (n1 + n2 + n3 + n4 + n5) / 5.0;
	
	printf("\nAverage is : %2.f",average);
}