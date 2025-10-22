#include<stdio.h>

void average ( int *a, int *b, int *c, int *d, int *e);

void main ()
{
	int n1, n2, n3, n4, n5;
	
	printf("Enter five numbers: ");
	scanf("%d%d%d%d%d",&n1,&n2,&n3,&n4,&n5);
	
	average (&n1,&n2,&n3,&n4,&n5);
}

void average ( int *a, int *b, int *c, int *d, int *e)
{
	float avg;
	
	avg = (*a + *b + *c + *d + *e) / 5.0;
	
	printf("Average is: %.2f",avg);
}