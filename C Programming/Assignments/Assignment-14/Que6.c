#include<stdio.h>
#include<string.h>

struct Date
{
	int date;
	char month[20];
	int year;
};

void main()
{
	struct Date A1, A2;
	
	A1.date=9;
	strcpy(A1.month,"august");
	A1.year=2006;
	
	printf("Enter date of A2 : ");
	scanf("%d",&A2.date);
	printf("Enter Month of A2 : ");
	scanf("%s",A2.month);
	printf("Enter year of A2 : ");
	scanf("%d",&A2.year);
	
	printf("\nPerson 1 details\n");
	printf("Date of A1: %d\n",A1.date);
	printf("Month of A1: %s\n",A1.month);
	printf("Year of A1: %d\n",A1.year);
	
	printf("\nPerson 2 details\n");
	printf("Date of A2: %d\n",A2.date);
	printf("Month of A2: %s\n",A2.month);
	printf("Year of A2: %d\n",A2.year);
}