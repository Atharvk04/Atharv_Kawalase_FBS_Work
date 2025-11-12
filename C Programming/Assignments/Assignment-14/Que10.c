#include<stdio.h>
#include<string.h>

struct Product
{
	int id;
	char name[20];
	int quantity;
	float price;
};

void main()
{
	struct Product P1, P2;
	
	P1.id=785;
	strcpy(P1.name,"OrientFan");
	P1.quantity=3;
	P1.price=939.87;
	
	printf("Enter Id of P2: ");
	scanf("%d",&P2.id);
	printf("Enter name of P2 ");
	scanf("%s",P2.name);
	printf("Enter quantity of P2: ");
	scanf("%d",&P2.quantity);
	printf("Enter price of P2: ");
	scanf("%f",&P2.price);
	
	printf("\nProduct 1 Details\n");
	printf("Id of P1: %d\n",P1.id);
	printf("Name of P1: %s\n",P1.name);
	printf("Quantity of P1: %d\n",P1.quantity);
	printf("Price of P1: %.2f\n",P1.price);
	
	printf("\nProduct 2 Details\n");
	printf("Id of P2: %d\n",P2.id);
	printf("Name of P2: %s\n",P2.name);
	printf("Quantity of P2: %d\n",P2.quantity);
	printf("Price of P2: %.2f\n",P2.price);
}