#include<stdio.h>
#include<string.h>

typedef struct student
{	
	int rollno;
	char name[20];
	int marks;
}Student;

void storeStudents(Student* );
void displayStudents(Student*);

void main()
{
	Student S1;
	
	storeStudents(&S1); // PASS BY ADDRESS.
	
	displayStudents(&S1);
}

void storeStudents(Student* S1)
{
	printf("Enter Roll Number: ");
	scanf("%d",&S1->rollno);
	
	printf("Enter Name: ");
	scanf("%s",S1->name);
	
	printf("Enter Marks: ");
	scanf("%d",&S1->marks);
}

void displayStudents(Student* S1)
{
	printf("\nRoll number of student: %d\n",S1->rollno);
	printf("Name of students: %s\n",S1->name);
	printf("Marks of students: %d\n",S1->marks);
}