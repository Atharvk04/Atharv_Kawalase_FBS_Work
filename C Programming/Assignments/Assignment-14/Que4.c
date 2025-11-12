#include<stdio.h>
#include<string.h>

struct HR
{
	int id;
	char name[20];
	double salary;
	float commission;
};

void main()
{
	struct HR HR1, HR2;
	
	HR1.id=895;
	strcpy(HR1.name,"Atharv");
	HR1.salary=75000;
	HR1.commission=5374.72;
	
	printf("Enter Id of the HR: ");
	scanf("%d",&HR2.id);
	printf("Enter name of HR: ");
	scanf("%s",HR2.name);
	printf("Salary Of the HR: ");
	scanf("%lf",&HR2.salary);
	printf("Enter the commission of HR: ");
	scanf("%f",&HR2.commission);
	
	printf("\n---HR 1 Information---\n");
	printf("Id of the HR: %d\n",HR1.id);
	printf("Name of the HR: %s\n",HR1.name);
	printf("Salary of the HR: %.2lf\n",HR1.salary);
	printf("Allowance of HR: %.2f\n",HR1.commission);
	
	printf("\n---HR 2 Information---\n");
	printf("Id of the HR: %d\n",HR2.id);
	printf("Name of the HR: %s\n",HR2.name);
	printf("Salary of the HR: %.2lf\n",HR2.salary);
	printf("Allowance of HR: %.2f\n",HR2.commission);
	
}