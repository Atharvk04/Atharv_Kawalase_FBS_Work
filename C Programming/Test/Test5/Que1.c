//1. WAP to calculate selling price of book based on cost price and discount.
//( using function and nested if- else )


#include<stdio.h>

float sellingPrice(int, int );

void main()
{
	int cost, discount;
	printf("Enter Cost Price: ");
	scanf("%d",&cost);
	
	printf("Enter Discount you get: ");
	scanf("%d",&discount);
	
	float sellPrice = sellingPrice(cost, discount);
	
	printf("Selling Price Of Book is: %.2f",sellPrice);	
}
float sellingPrice(int cost, int discount)
{
	float disc = (float)discount / 100;
	float selling = cost-(cost*disc);
	
	return selling;
}