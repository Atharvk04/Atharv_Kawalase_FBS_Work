#include<stdio.h>
#include<string.h>

struct fan
{
	int modelno;
	char name[20];
	float price;
};
void main()
{
	struct fan f1;
	struct fan f2;
	f1.modelno=1023;
	strcpy(f1.name,"Bajaj857");
	f1.price=875.99;
	
	printf("Enter model number: ");
	scanf("%d",&f2.modelno);
	printf("Enter Model Name: ");
	scanf("%s",f2.name);
	printf("Enter price of number: ");
	scanf("%.2f",&f2.price);
	
	printf("\nModel No = %d\n",f1.modelno);
	printf("Model Name = %s\n",f1.name);
	printf("Price = %.2f",f1.price);
	
	printf("\nModel No = %d\n",f2.modelno);
	printf("Model Name = %s\n",f2.name);
	printf("Price = %.2f",f2.price);
}