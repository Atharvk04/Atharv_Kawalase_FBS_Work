#include<stdio.h>
#include<string.h>

struct Student
{
	int rollno;
	char name[20];
	int marks;
};

void main()
{
	struct Student s1,s2;
	
	s1.rollno=101;
	strcpy(s1.name,"Atharv");
	s1.marks=85;
	
	printf("Enter roll number of student: ");
	scanf("%d",&s2.rollno);
	printf("Enter name of student: ");
	scanf("%s",s2.name);
	printf("Enter marks obtained: ");
	scanf("%d",&s2.marks);
	
	
	printf("\n---Student 1 details---\n");
	printf("Roll number of student: %d\n",s1.rollno);
	printf("Name of student: %s\n",s1.name);
	printf("Marks obtained by student: %d",s1.marks);
	
	printf("\n---Student 2 details---\n");
	printf("Roll number of student: %d\n",s2.rollno);
	printf("Name of student: %s\n",s2.name);
	printf("Marks obtained by student: %d",s2.marks);
}