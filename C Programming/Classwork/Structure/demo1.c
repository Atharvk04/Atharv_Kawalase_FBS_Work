#include<stdio.h>

typedef struct student {
	int rollno;
	char name[20];
	int marks;
} Student;

void storeStudent(Student*, int);
void displayStudents(Student*, int);
int searchStudenByRollNo(Student*,int,int);
void updateStudent(Student*,int);
void main()
 {
 	Student table[100]=
 	{
        {101, "Ashish", 85},
        {102, "Atharv", 90},
        {103, "Rohit", 78},
        {104, "Anujay", 88}	
	};
 	
 	
	Student july[2],aug[3],sept[4];

//	storeStudent(july,2);
//	storeStudent(aug,3);
	//storeStudent(sept,4);

//	displayStudents(july,2);
//	displayStudents(aug,3);
	displayStudents(sept,4);
	

	int res = searchStudenByRollNo(sept,4,104);
	if(res != -1)
		printf("\n %s found.",sept[res].name);

	else
		printf("\n Not Found.");


}
void storeStudent(Student* ptr, int size)
{
	int i;

	printf("\n-----Enter the details of students-----\n");
	for(i = 0; i < size; i++) {
		printf("\nStudent %d:\n",i+1);
		printf("Enter roll no: \n");
		scanf("%d",&ptr[i].rollno);

		printf("Enter name of student: \n");
		scanf("%s",ptr[i].name);

		printf("Enter Marks of student: \n");
		scanf("%d",&ptr[i].marks);

		printf("Student added.\n");
	}
}


void displayStudents(Student* ptr,int size)
{
	int i;
	for(i=0; i < size; i++) {
		printf("\nStudent %d:\n", i + 1);
		printf("\n Roll no: %d",ptr[i].rollno);
		printf("\n Name: %s",ptr[i].name);
		printf("\n Marks: %d",ptr[i].marks);
	}
}
     
int searchStudenByRollNo(Student* p,int size,int roll) 
{
	int i;
	int flag = 0;

	for(i=0; i < size; i++) {
		if(p[i].rollno == roll)
			return i;
	}
	return -1;
}