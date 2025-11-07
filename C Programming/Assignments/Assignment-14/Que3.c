#include<stdio.h>
#include<string.h>

struct Admin
{
	int id;
	char name[20];
	double salary;
	float allowance;
};

void main()
{
	struct Admin A1,A2;
	
	A1.id=1897;
	strcpy(A1.name,"Atharv");
	A1.salary=75000;
	A1.allowance=5374.72;
	
	printf("Enter Id of the Admin: ");
	scanf("%d",&A1.id);
	printf("Enter name of Admin: ");
	scanf("%s",A1.name);
	printf("Salary Of the Admin: ");
	scanf("%lf",&A1.salary);
	printf("Enter the allowance of Admin: ");
	scanf("%f",&A1.allowance);
	
	printf("\n---Admin 1 Information---\n");
	printf("Id of the admin: %d\n",A1.id);
	printf("Name of the admin: %s\n",A1.name);
	printf("Salary of the admin: %.2lf\n",A1.salary);
	printf("Allowance of admin: %.2f\n",A1.allowance);
	
	printf("\n---Admin 2 Information---\n");
	printf("Id of the admin: %d\n",A2.id);
	printf("Name of the admin: %s\n",A2.name);
	printf("Salary of the admin: %.2lf\n",A2.salary);
	printf("Allowance of admin: %.2f\n",A2.allowance);
}