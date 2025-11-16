#include <stdio.h>
#include <string.h>

typedef struct student
{
    int rollno;
    char name[20];
    int marks;
} Student;

void storeStudents(Student*, int*);
void displayStudents(Student*, int);
int searchStudentByRollNo(Student*, int, int);
void updateStudents(Student*, int);
void deleteStudents(Student*, int* );

int main()
{
    Student students[100];
    int size = 0;
    int choice = 0;

    printf("\n----- Student Management System -----\n");
    storeStudents(students, &size);

    while (1)
    {
        printf("\n-----------------------\n");
        printf("Press 1 to display.\n");
        printf("Press 2 to search.\n");
        printf("Press 3 to update.\n");
        printf("Press 4 to delete.\n");
        printf("Press 5 to exit.\n");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);

        if (choice == 1)
        {
            displayStudents(students, size);
        }
        else if (choice == 2)
        {
            int roll;
            printf("\nEnter RollNo to search: ");
            scanf("%d", &roll);

            int res = searchStudentByRollNo(students, size, roll);
            if (res != -1)
                printf("\n%s found with %d marks.\n", students[res].name, students[res].marks);
            else
                printf("\nStudent not found.\n");
        }
        else if (choice == 3)
        {
            updateStudents(students, size);
        }
        else if (choice == 4)
		{
    		deleteStudents(students, &size);
		}

        else if (choice == 5)
        {
            printf("\nExit.\n");
            break;
        }
        else
        {
            printf("\nInvalid Choice.\n");
        }
    }

    return 0;
}

void storeStudents(Student* ptr, int* size)
{
    ptr[0].rollno = 101;
    strcpy(ptr[0].name, "Atharv");
    ptr[0].marks = 85;

    ptr[1].rollno = 102;
    strcpy(ptr[1].name, "Rohit");
    ptr[1].marks = 90;

    ptr[2].rollno = 103;
    strcpy(ptr[2].name, "Ashish");
    ptr[2].marks = 78;

    ptr[3].rollno = 104;
    strcpy(ptr[3].name, "Yuvraj");
    ptr[3].marks = 88;

    *size = 4; //*size = 4; means ?? store the value 4 in the variable that size is pointing to (i.e., update the original size in main).
    printf("\nHardcoded 4 students loaded successfully!\n");
}

void displayStudents(Student* ptr, int size)
{
    if (size == 0)
    {
        printf("\nNo students to display.\n");
        return;
    }

    for (int i = 0; i < size; i++)
    {
        printf("Roll no: %d    Name: %s    Marks: %d\n",
               ptr[i].rollno, ptr[i].name, ptr[i].marks);
    }
}

int searchStudentByRollNo(Student* ptr, int size, int roll)
{
    for (int i = 0; i < size; i++)
    {
        if (ptr[i].rollno == roll)
            return i;
    }
    return -1;
}

void updateStudents(Student* ptr, int size)
{
    int roll;
    printf("\nEnter roll number to update: ");
    scanf("%d", &roll);

    int index = searchStudentByRollNo(ptr, size, roll);
    if (index == -1)
    {
        printf("\nStudent not found.\n");
        return;
    }

    printf("Enter new marks: ");
    scanf("%d", &ptr[index].marks);

    printf("\nRecord updated successfully.\n");
}

void deleteStudents(Student* ptr, int* size)
{
	int roll;
	printf("\nEnter roll number to delete: ");
	scanf("%d",&roll);
	
	int index = searchStudentByRollNo(ptr, *size, roll);
	if(index == -1)
	{
		printf("Student not found.");
		return;
	}
	
	for(int i = index; i< *size - 1; i++)
	{
		ptr[i] = ptr [ i + 1];
	}
	(*size)--;
	
	printf("\nStudent Deleted Successfully.\n");
}