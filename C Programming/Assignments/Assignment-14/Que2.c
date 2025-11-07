#include<stdio.h>
#include<string.h>

struct Employee
{
	int id;
	char name[20];
	double salary;	
};

void main()
{
	struct Employee E1,E2;
	
	E1.id=215;
	strcpy(E1.name,"Sakshi");
	E1.salary=85000;
	
	printf("Enter Employee id: ");
	scanf("%d",&E2.id);
	printf("Enter name of the employee: ");
	scanf("%s",E2.name);
	printf("Enter Salary of the employee: ");
	scanf("%lf",&E2.salary);
	
	printf("\n---Information of Employee 1---\n");
	printf("Id of the Employee: %d\n",E1.id);
	printf("Name of the Employee: %s\n",E1.name);
	printf("Salary of the employee: %.2lf\n",E1.salary);
	
	printf("\n---Information of Employee 2---\n");
	printf("Id of the Employee: %d\n",E2.id);
	printf("Name of the Employee: %s\n",E2.name);
	printf("Salary of the employee: %.2lf",E2.salary);
}