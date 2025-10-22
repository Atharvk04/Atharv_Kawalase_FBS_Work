#include<stdio.h>

void average ( int *a, int *b, int *c, int *d, int *e);

void main ()
{
	int s1, s2, s3, s4, s5;
	
	printf("Enter five numbers: ");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	
	average (&s1,&s2,&s3,&s4,&s5);
}

void average ( int *a, int *b, int *c, int *d, int *e)
{
	float avg;
	
	avg = (*a + *b + *c + *d + *e) / 5.0;
	
	printf("Average is: %.2f",avg);
}