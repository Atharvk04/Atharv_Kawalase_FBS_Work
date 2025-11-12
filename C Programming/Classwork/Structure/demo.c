#include<stdio.h>

typedef struct student
{
	int rollno;
	char name[20];
	int marks;
}Student;

void main()
{
	struct student sarr[5];
	
	printf("\n--- Enter details of 5 students ---\n ");
	for(int i=0; i<5;i++)
	{	
		printf("\nStudent %d:\n", i + 1);
	
		printf("Enter roll no. ");
		scanf("%d",&sarr[i].rollno);
		
		printf("Enter name:");
		scanf("%s",sarr[i].name);
		
		printf("Enter marks:");
		scanf("%d",&sarr[i].marks);
		
		printf("\nstudent added\n");
	}
	
	printf("\n=========================\n");
	printf("\n-----Student Details-----\n");
	printf("\n=========================\n");
	
	for(int i=0; i<5;i++)
	{
		printf("\nStudent %d:\n", i + 1);
		
		printf("Roll no: %d\n",sarr[i].rollno);
		
		printf("Name: %s\n",sarr[i].name);
		
		printf("Marks: %d\n",sarr[i].marks);
	}
}