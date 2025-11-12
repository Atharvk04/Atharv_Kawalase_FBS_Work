#include<stdio.h>

typedef struct student
{
	int rollno;
	char name[20];
	int marks;
}Student;

void main()
{
	Student july[5],aug[10],sept[15];
	int i;
	
	printf("\n-----Enter the details of July student-----\n");
	for(i = 0; i < 5; i++)
	{
		printf("\nStudent %d:\n",i+1);
		printf("Enter roll no: ");
		scanf("%d",&july[i].rollno);
		
		printf("Enter name of student: ");
		scanf("%s",july[i].name);
		
		printf("Enter Marks of student: ");
		scanf("%d",&july[i].marks);
		
		printf("Student added.\n");	
	} 
	
	printf("\n-----Enter the details of August student-----\n");
	for(i = 0; i < 10; i++)
	{
		printf("\nStudent %d:\n",i+1);
		printf("Enter roll no: ");
		scanf("%d",&aug[i].rollno);
		
		printf("Enter name of student: ");
		scanf("%s",aug[i].name);
		
		printf("Enter Marks of student: ");
		scanf("%d",&aug[i].marks);
		
		printf("Student added.\n");	
	} 
	
	printf("\n-----Enter the details of Sept student-----\n");
	for(i = 0; i < 15; i++)
	{
		printf("\nStudent %d:\n",i+1);
		printf("Enter roll no: ");
		scanf("%d",&sept[i].rollno);
		
		printf("Enter name of student: ");
		scanf("%s",sept[i].name);
		
		printf("Enter Marks of student: ");
		scanf("%d",&sept[i].marks);
		
		printf("Student added.\n");	
	} 
	
	printf("\n=========================\n");
    printf("----- July Students -----\n");
    printf("=========================\n");
    
    for(i=0; i < 5; i++)
    {
    	printf("\nStudent %d:\n", i + 1);
    	printf("Roll no: %d",july[i].rollno);
    	printf("Name: %s",july[i].name);
    	printf("Marks: %d",july[i].marks);
	}
	
	printf("\n=========================\n");
    printf("----- August Students -----\n");
    printf("=========================\n");
    
    for(i=0; i < 10; i++)
    {
    	printf("\nStudent %d:\n", i + 1);
    	printf("Roll no: %d",aug[i].rollno);
    	printf("Name: %s",aug[i].name);
    	printf("Marks: %d",aug[i].marks);
	}
	
	printf("\n=========================\n");
    printf("----- Sept Students -----\n");
    printf("=========================\n");
    
    for(i=0; i < 15; i++)
    {
    	printf("\nStudent %d:\n", i + 1);
    	printf("Roll no: %d",sept[i].rollno);
    	printf("Name: %s",sept[i].name);
    	printf("Marks: %d",sept[i].marks);
	}
}