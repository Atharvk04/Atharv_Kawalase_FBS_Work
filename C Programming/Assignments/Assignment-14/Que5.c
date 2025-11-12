#include<stdio.h>
#include<string.h>

struct salesManager
{
	int id;
	char name[20];
	double salary;
	float incentive;
	int target;
};

void main()
{
	struct salesManager S1, S2;
	S1.id=652;
	strcpy(S1.name,"Atharv");
	S1.salary=89000;
	S1.incentive=8010.35;
	S1.target=102;
	
	printf("Enter id of S2: ");
	scanf("%d",&S2.id);
	printf("Enter name of S2: ");
	scanf("%s",S2.name);
	printf("Enter salary of S2: ");
	scanf("%lf",&S2.salary);
	printf("Enter incentive of S2: ");
	scanf("%f",&S2.incentive);
	printf("Enter Target of S2: ");
	scanf("%d",&S2.target);
	
	printf("\n---SalesManager 1 Information---\n");
	printf("Id of the S1: %d\n",S1.id);
	printf("Name of the S1: %s\n",S1.name);
	printf("Salary of the S1: %.2lf\n",S1.salary);
	printf("Incentive of S1: %.2f\n",S1.incentive);
	printf("Target of S1: %d\n",S1.target);
	
	printf("\n---SalesManager 2 Information---\n");
	printf("Id of the S2: %d\n",S2.id);
	printf("Name of the S2: %s\n",S2.name);
	printf("Salary of the S2: %.2lf\n",S2.salary);
	printf("Incentive of S2: %.2f\n",S2.incentive);
	printf("Target of S2: %d\n",S2.target);

}