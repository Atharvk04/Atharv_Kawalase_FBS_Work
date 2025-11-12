#include<stdio.h>
#include<string.h>

struct Time
{
	int hour;
	int min;
	int sec;
};

void main()
{
	struct Time T1, T2;
	
	T1.hour=5;
	T1.min=46;
	T1.sec=19;
	
	printf("Enter Hours of T2: ");
	scanf("%d",&T2.hour);
	printf("Enter minutes of T2: ");
	scanf("%d",&T2.min);
	printf("Enter seconds of T2: ");
	scanf("%d",&T2.sec);
	
	printf("\nT1 details\n");
	printf("Hours of T1: %d\n",T1.hour);
	printf("Minutes of T1: %d\n",T1.min);
	printf("Seconds of T1: %d\n",T1.sec);
	
	printf("\nT2 details\n");
	printf("Hours of T2: %d\n",T2.hour);
	printf("Minutes of T2: %d\n",T2.min);
	printf("Seconds of T2: %d\n",T2.sec);
}